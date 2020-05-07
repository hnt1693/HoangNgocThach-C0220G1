select HopDong.IDHopDong, TenLoaiDichVu, DVDK.TenDIchVuDiKem, SoLuong
from furama.HopDong
         join furama.HopDongChiTiet HDCT on HopDong.IDHopDong = HDCT.IDHopDong
         join furama.DichVuDiKem DVDK on HDCT.IDDichVuDiKem = DVDK.IDDichVuDiKem
         join furama.DichVu DV on HopDong.IDDichVu = DV.IDDichVu
         join furama.LoaiDichVu LDV on DV.IDLoaiDichVu = LDV.IDLoaiDichVu
         join (select TenDIchVuDiKem,sum(SoLuong)
               from furama.DichVuDiKem
                        inner join furama.HopDongChiTiet HDCT on DichVuDiKem.IDDichVuDiKem = HDCT.IDDichVuDiKem
               group by DichVuDiKem.IDDichVuDiKem
               having sum(SoLuong) = 1) as s on  s.TenDIchVuDiKem = DVDK.TenDIchVuDiKem ;

