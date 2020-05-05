select HopDong.IDHopDong, TenLoaiDichVu, TenDIchVuDiKem
from furama.HopDong
         join furama.DichVu DV on HopDong.IDDichVu = DV.IDDichVu
         join furama.HopDongChiTiet HDCT on HopDong.IDHopDong = HDCT.IDHopDong
         join furama.DichVuDiKem DVDK on HDCT.IDDichVuDiKem = DVDK.IDDichVuDiKem
         join furama.LoaiDichVu LDV on DV.IDLoaiDichVu = LDV.IDLoaiDichVu
         join furama.KhachHang KH on HopDong.IDKhachHang = KH.IDKhachHang
         join furama.LoaiKhach LK on KH.IDLoaiKhach = LK.IDLoaiKhach
where TenLoaiKhach = 'Diamond'  and DiaChi in ('Quảng Trị','Đà Nẵng')