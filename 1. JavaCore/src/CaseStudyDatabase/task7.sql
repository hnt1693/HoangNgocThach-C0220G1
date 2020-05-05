select DichVu.IDDichVu,
       TenDichVu,
       DienTich,
       SoNguoiToiDa,
       ChiPhiThue,
       TenLoaiDichVu

from furama.DichVu join furama.LoaiDichVu LDV on DichVu.IDLoaiDichVu = LDV.IDLoaiDichVu
where exists(select furama.HopDong.IDDichVu from furama.HopDong where year(NgayLamHopDong) = 2018 and HopDong.IDDichVu=DichVu.IDDichVu)
  and not exists(select HopDong.IDDichVu from furama.HopDong where year(NgayLamHopDong) = 2019 and HopDong.IDDichVu=DichVu.IDDichVu);