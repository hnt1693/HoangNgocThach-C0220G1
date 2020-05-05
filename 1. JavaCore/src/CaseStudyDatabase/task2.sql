select furama.NhanVien.HoTen
from furama.NhanVien
where (HoTen like 'H%' OR HoTen like 'T%' OR HoTen like '%K')
  AND LENGTH(HoTen) < 25;