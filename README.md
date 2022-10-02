# Coroutine Scope

* Kotlin Coroutines, asenkron olarak çalışan kodu basitleştirmek için Android'de kullanabileceğimiz bir asenkron tasarım modelidir. Android'de, Main Thread’i  bloklayabilecek ve uygulamamızın yanıt vermemesine neden olabilecek uzun süreli işlemleri yönetmemize yardımcı olur.

# Suspend Fonsiyonlar

* Özetle; suspend functionlar, mevcut threadi bloke etmeden coroutinin yürütülmesini askıya alır. Böylelikle thread başka bir corutinenin işletilmesine başlar ve cpu daha verimli bir şekilde kullanılmış olur.

## Gözlemlenenler

#### 1) Döngü kitlenmeye sebep oldu mu ? 

* Evet kitlenmeye sebep oldu.
* Coroutine Scope sadece döngü kırıldıktan sonra çalıştı.

#### 2) Kilitlenmeye sebep olmadan Coroutine Scope çalışır mı ?

* Oluşturduğumuz sonsuz döngü ana thread üzerinde çalıştığı için, döngüyü bitirmeden Coroutine Scope çalışmaz.
* Eğer oluşturduğumuz sonsuz döngüyü kırarsak Coroutine Scope çalışır.
