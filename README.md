# Emlak Yönetim Sistemi
Bu Java programı, çoklu daireler (Daire), binalar (Bina), ev sahipleri (Evsahibi) ve kiracılar (Kiraci) için sınıflar içeren basit bir emlak yönetim sistemini temsil eder. Program, çoklu dairelere sahip binaları oluşturmanıza ve yönetmenize, binalara ev sahipleri atamanıza, kiracıları dairelere eklemenize ve bir binadaki daireleri sıralamanıza izin verir.

Sınıflar:
1. Konut (Abstract Sınıf)
Konutlar için temel sınıfı temsil eder.
Adres için özel bir alan içerir.
Adresi almak için bir yöntem sağlar.
Bilgileri görüntülemek için soyut bir yöntem bildirir.
2. Daire (Sınıf)
Konut'u genişletir ve Comparable<Daire>'yi uygular.
Bireysel bir daireyi temsil eder.
Daire numarası için alanlar içerir ve daire numarasına göre karşılaştırma yapmayı uygular.
displayInfo yöntemini geçersiz kılar.
3. Bina (Sınıf)
Konut'u genişletir.
Birden fazla daireye sahip bir binayı temsil eder.
Dairelerin bir listesini korur.
Daire eklemek, göstermek ve binadaki daireleri sıralamak için yöntemler sağlar.
4. Evsahibi (Sınıf)
Display arabirimini uygular.
Bir binayla ilişkilendirilmiş bir ev sahibini temsil eder.
Ev sahibinin adı, soyadı ve ilişkilendirilmiş binanın alanlarını içerir.
Bilgileri görüntülemek ve ilişkilendirilmiş binaya daire eklemek için bir yöntem sağlar.
5. Kiraci (Sınıf)
Display arabirimini uygular.
Bir ev sahibi ile ilişkilendirilmiş bir kiracıyı temsil eder.
Kiracının adı, soyadı ve ilişkilendirilmiş ev sahibi alanlarını içerir.
Bilgileri görüntülemek için bir yöntem sağlar.
