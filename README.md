# homework-2

## Ödev 1 

Lifecyle Nedir? Nasıl yönetiriz? Ne gibi problemler olur ve nasıl kaçarız?

## Ödev 2

Derste birlikte yapılan Sign ve Sign Up sayfaların tasarımlarının yapılması. Bu iki tasarımı İki Activity olarak yapılacak ve Sign up butuna basıldığında Sign Up ekranı gelmesi beklenmekte.


                                                      ACTIVITY YAŞAM DÖNGÜSÜ 

 

Activity, bir uygulamanın ekranını temsil eder ve kullanıcıların uygulamayla etkileşime girebilmesini sağlar. Uygulamalar birden fazla ekran içerebilir ve her ekran “Activity” sınıfının bir uzantısı olur. Çok sayıda olabilen aktivitelerden birini main aktivite olarak seçip, uygulama başlatıldığında belirlen ilk ekran olmasını sağlayabiliriz. 

Bir uygulamada her aktivite, gereksinimlere göre farklı eylemler gerçekleştirebilmek için başka aktiviteleri başlatabilir. Örneğin, maillerimizi sıralayan ana aktivite ekranında yeni bir mail oluşturma, kişiler üzerinden birilerini arayabilme gibi işlevleri sağlayabilmek için farklı aktiviteleri başlatmamız gerekebilir. Tüm bu aktiviteler bir birlerine bağlıdır kullanıcıya daha iyi bir hizmet sağlayabilmek için birlikte çalışır. Kısacası aktiviteler uygulama üzerinde nelerin değiştiğini, yüklendiğini sağlayabilmek için ve bunları sağlarken uygulamanın ilerleyişini, durdurulmasını, sonlandırılmasını sağlamak amacıyla kullanılmaktadır. Böylelikle kullanıcı uygulama ile etkileşime girdiğimde neler yaptığından haberdar olmamızı sağlar. Kullanıcı etkileşime girdiğinde uygulamanın nasıl davranacağını belirlememiz gerekir. Bir kaç örnek vermek gerekirse; uygulama kullanılırken bir arama gelmesi durumunda, arama sonlandıktan sonra uygulamamızın düzgün bir şekilde çalışması, gereksiz CPU ve RAM tüketiminin önüne geçilmesi, landscape ve portrait modlar arası geçişte kullanımında veri kaybının yaşanmaması gibi durumlar söylenebilir. Bu tür durumlar için aktivitelerin arka planda nasıl çalıştığını bilmek önemlidir. 

 

Aktivite Yaşam Döngüsü Callback Metotları 

Bir aktivite kullanım durumuna göre belirli durumlardan geçer. Aktivite callback metotlarını kullanarak kullanıcı uygulama üzerinde neler yaptığını veya uygulamadan geçici/kalıcı süre ayrıldığında uygulamanın nasıl davranacağını tanımlayabiliriz. 

 

onCreate() Fonksiyonu 

onCreate() metodu zorunlu olarak yazılan bir metotdur. İlk callback metodudur ve bir aktivite ilk önce onCreate() metodunu çağırır. Aktivite oluşturma sırasında iken aktivite “Created” durumuna geçer. Bir aktivitenin yalnızca bir kez çalıştırması gereken işlemler varsa istenilen fonksiyonlar onCreate() metodu içerisinde çağırılabilir. Kısacası aktivite oluşturulduğu zaman yapılacak işlemler bu metodun içerisinde yazılır. onCreate() metodunun yürütülmesi bittiğinde, aktivite “Created” durumuna girer ve onStart() metodu çağırılır. 

 

onStart() Fonksiyonu 

Kullanıcının etkileşime geçeceği görüntüleri yani UI’ların başlatıldığı ve gösterildiği fonksiyondur. Bu metot hızlı bir şekilde çalıştığı için ağır işlemler yapılması tercih edilmez. Metodun yürütülmesi tamamlandıktan sonra aktivite “Resumed” durumuna girer ve onResume() fonksiyonu çağırılır. 

  

onResume() Fonksiyonu 

Yapılacak işlemlerin devamlı durumda olacağı, kullanıcının etkileşime girdiği durumdur. Uygulamaların temel işlevleri onRsume() metodunda uygulanır. Bir arama olması durumuna, başka bir aktiviteye geçiş, uygulamadan çıkılmadığı kısacası herhangi bir işlem yapılana kadar bu metotta kalmaktadır. Uygulamayı aksatacak bir aktivite gerçekleşene kadar “Resumed” durumunda kalır. Bu durumda herhangi bir kesinti olursa aktivite “Paused” durumuna girecek ve onPaused() fonksiyonu çağırılacaktır. “Paused” durumundan “Resumed” durumuna döndürülen bir aktiviteden sonra, tekrar onResume() fonksiyonu çağırılır. Bu sebeple onPaused() sırasında yapılan işlemleri geri almak için tekrar onResume() fonksiyonunu düzgünce oluşturmak gerekiyor.  

 

onPause() Fonksiyonu 

Uygulama aşağı alındığında, bir arama gerçekleşmesi gibi durumlarda bu fonksiyon çalışır.  onPause() metodunu uygulama çalışırken herhangi bir şekilde kesintiye uğradığında gerçekleşmesi gereken işlemleri çağırırız. OnPause() metodu tamamlandıktan sonra, bir aktivide “Paused” durumuna girip ardından ne olacağına bağlı olarak onResume() veya onStop() metodu çağırılır. 

 

onStop() Fonksiyonu 

Kullanıcı uygulamadan çıktığında çağrılan metottur. Kullanıcının artık ihtiyaç duymadığı tüm uygulama kaynaklarının serbest bırakılması için uygun bir yerdir. Böylelikle CPU ve RAM de gereksiz işlemlerin olmamasını sağlarız. Aktivite durdurulup, yeniden açıldığında uygulama  bu metottan onRestart() metoduna gider. Eğer aktivide çalışması bitmişse onStop() metoduna çağırılır. 

 

OnRestart() Fonksiyonu 

Bir aktivide durdurulup yeniden başlatıldığında onRestart() fonksiyonu çağırılır. Durdurulduğu zamandan itibaren aktivite durumunu geri yükler. Arından onStart() fonksiyonu çağırılır. 

 

onDestroy() Fonksiyonu 

Aktivite yok edilmeden önce onDestroy() metodu çağırılır. Uygulamadan arta kalan işlemleri bilgileri silerek belleği temizler. Bu fonksiyona finish() ile de ulaşabiliriz. Bu metotta bilgi kaydetmek hatalıdır. 

 

Uygulama Açık İken Oluşabilecek Senaryolar 

Uygulama açıldığında 

onCreate() –> onStart() –> onResume() 

Geri tuşuna basıldığında 

onBackPressed() –> onPaused() –> onStop() –> onDestroy() 

Home tuşuna basıldığında 

onPaused() –> onStop() 

Telefon ekranı tekrar açıldığında 

onRestart() –> onStart() –> onResume() 

Telefonu döndürdüğümüzde (yatay ) 

onPause() –> onStop() –> onSaveInstance() –> onDestroy() 
