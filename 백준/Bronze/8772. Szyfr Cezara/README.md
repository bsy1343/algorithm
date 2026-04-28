# [Bronze II] Szyfr Cezara - 8772

[문제 링크](https://www.acmicpc.net/problem/8772)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 176, 정답: 132, 맞힌 사람: 103, 정답 비율: 74.638%

### 분류

구현, 문자열

### 문제 설명

<p>Hektor zapoznał się niedawno z metodą szyfrowania wiadomości nazywaną &quot;szyfrem Cezara&quot;. To metoda opierająca się na pozycjach, jakie poszczeg&oacute;lne litery zajmują w alfabecie. W zadaniu będziemy rozważać standardowy alfabet angielski złożony z 26 liter:</p>

<pre>
a b c d e f g h i j k l m n o p q r s t u v w x y z</pre>

<p>Aby zaszyfrować wiadomość szyfrem Cezara, należy na początku wybrać liczbę z przedziału od 0 do 25 (chociaż liczba 0 będzie skutkować wyjątkowo nieskutecznym szyfrowaniem), kt&oacute;rą nazwiemy&nbsp;<strong>K</strong>. Następnie należy każdą z liter wiadomości zastąpić literą położoną o&nbsp;<strong>K</strong>&nbsp;pozycji dalej w alfabecie. W przypadku, w kt&oacute;rym litera położona o&nbsp;<strong>K</strong>&nbsp;pozycji dalej od zadanej wypada poza alfabet, należy uznać, że alfabet powtarza się w nieskończoność, tj. zaraz po literze &quot;z&quot; występuje ponownie &quot;a&quot;, następnie &quot;b&quot;, etc.</p>

<p>Przykładowo, dla&nbsp;<strong>K</strong>&nbsp;= 2, wiadomość &quot;zoska&quot; zostanie zaszyfrowana jako &quot;bqumc&quot;.</p>

<p>Hektor przesłał Wiktorowi wiadomość zaszyfrowaną szyfrem Cezara, nie podając jednak jednak wartości&nbsp;<strong>K</strong>, kt&oacute;rej użył do szyfrowania. Zamiast tego, wraz z wiadomością przesłał Wiktorowi informację o tym, na jaką literę zaczynała się przesyłana wiadomość przed zaszyfrowaniem. Czy taka informacja wystarczy do odszyfrowania wiadomości?</p>

<p>Napisz program, kt&oacute;ry znając pierwszą literę pierwotnej wiadomości i jej wersję zaszyfrowaną opisanym wyżej szyfrem, odszyfruje wiadomość.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy. Opis każdego zestawu składa się z trzech linii.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera liczbę naturalną&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000), oznaczającą liczbę liter zaszyfrowanej wiadomości.</p>

<p>W drugiej linii opisu zestawu znajduje się&nbsp;<strong>N</strong>&nbsp;małych liter alfabetu angielskiego, kt&oacute;re stanowią zaszyfrowaną wiadomość od Hektora.</p>

<p>Trzecia linia opisu zestawu zawiera jedną małą literę alfabetu angielskiego - jest to pierwsza litera pierwotnej wiadomości Hektora.</p>

### 출력

<p>Dla każdego testu należy w osobnej linii wypisać odszyfrowaną wiadomość od Hektora.</p>