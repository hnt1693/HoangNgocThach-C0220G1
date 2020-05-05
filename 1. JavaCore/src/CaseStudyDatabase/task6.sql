select furama.DichVu.IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu, NgayLamHopDong
from furama.DichVu
         left join furama.HopDong HD on DichVu.IDDichVu = HD.IDDichVu
         left join furama.LoaiDichVu LDV on DichVu.IDLoaiDichVu = LDV.IDLoaiDichVu
where (NgayLamHopDong > '2019-04-01')
   or (NgayLamHopDong is null)
