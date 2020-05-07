select HopDong.IDNhanVien, HoTen, TrinhDo, TenBoPhan, SDT, DiaChi, count(NV.IDNhanVien) as SLHD
from furama.HopDong
         inner join furama.NhanVien NV on HopDong.IDNhanVien = NV.IDNhanVien
         join furama.BoPhan BP on NV.IDBoPhan = BP.IDBoPhan
         join furama.TrinhDo TD on NV.IDTrinhDo = TD.IDTrinhDo
where year(NgayLamHopDong) between 2018 and 2019
group by NV.IDNhanVien
having count(NV.IDNhanVien) <= 3