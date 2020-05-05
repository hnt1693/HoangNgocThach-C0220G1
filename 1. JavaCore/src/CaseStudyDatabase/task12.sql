select TenDichVu,
       HD.IDHopDong,
       NV.HoTen as TenNV,
       KH.HoTen as TenKH,
       KH.SDT,
       DV.IDDichVu,
       SoLuong  as SLDVDiKem,
       TienDatCoc,
       NgayLamHopDong
from furama.HopDongChiTiet
         join furama.DichVuDiKem DVDK on HopDongChiTiet.IDDichVuDiKem = DVDK.IDDichVuDiKem
         join furama.HopDong HD on HopDongChiTiet.IDHopDong = HD.IDHopDong
         join furama.DichVu DV on HD.IDDichVu = DV.IDDichVu
         join furama.KhachHang KH on HD.IDKhachHang = KH.IDKhachHang
         join furama.NhanVien NV on HD.IDNhanVien = NV.IDNhanVien
where exists(select HD.IDDichVu
             from furama.HopDong
             where (year(HD.NgayLamHopDong) = 2019 and month(HD.NgayLamHopDong) in (10,11,12)
                 and HD.IDDichVu = DV.IDDichVu))
  and not exists((select HD.IDDichVu
                  from furama.HopDong
                  where (year(HD.NgayLamHopDong) = 2019 and month(HD.NgayLamHopDong) in (1,2,3,4,5,6)
                      and HD.IDDichVu = DV.IDDichVu)))