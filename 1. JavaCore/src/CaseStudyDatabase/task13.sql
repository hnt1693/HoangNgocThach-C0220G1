select TenDIchVuDiKem, sum(SoLuong)
from furama.DichVuDiKem
         join furama.HopDongChiTiet HDCT on DichVuDiKem.IDDichVuDiKem = HDCT.IDDichVuDiKem
group by TenDIchVuDiKem
having sum(SoLuong) = (select max(temp.SL)
                       from (select sum(SoLuong) as SL
                             from DichVuDiKem
                                      join furama.HopDongChiTiet HDCT on DichVuDiKem.IDDichVuDiKem = HDCT.IDDichVuDiKem
                             group by TenDIchVuDiKem) temp)