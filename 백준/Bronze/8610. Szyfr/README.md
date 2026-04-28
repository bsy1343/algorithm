# [Bronze I] Szyfr - 8610

[문제 링크](https://www.acmicpc.net/problem/8610)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 202, 정답: 128, 맞힌 사람: 85, 정답 비율: 56.667%

### 분류

구현, 문자열

### 문제 설명

<p>Jaś otrzymał sekretną wiadomość. Jest ona ciągiem wielkich liter alfabetu łacińskiego (kt&oacute;ry składa się z liter:&nbsp;<code>ABCDEFGHIJKLMNOPQRSTUVWXYZ</code>). Wie, że do jej zakodowania użyto szyfru Cezara. Jest to szyfr przesuwający kolejne litery wiadomości o określoną, stałą liczbę znak&oacute;w w alfabecie. Litery z końca alfabetu stają się w&oacute;wczas literami z jego początku. Dla przykładu, w wyniku zaszyfrowania wiadomości</p>

<p align="center"><code>ABCEGIKMOQSUVWXYZ</code></p>

<p>szyfrem Cezara z przesunięciem $4$, otrzymuje się wiadomość</p>

<p align="center"><code>EFGIKMOQSUWYZABCD</code></p>

<p>Jaś chciałby odszyfrować wiadomość. Nie wie niestety, jakiego dokonano w niej przesunięcia. Wielkie doświadczenie językowe Jasia pozwala mu jednak przewidzieć, jaka litera występowała najczęściej w oryginalnym tekście. Szczęście, kt&oacute;re mu zawsze towarzyszy, sprawiło także, że taka litera jest tylko jedna - tzn. nie ma dw&oacute;ch takich liter w oryginalnym tekście, kt&oacute;re jednocześnie występowałyby największą liczbę razy.</p>

<p>Pom&oacute;ż Jasiowi złamać szyfr, czyli odtworzyć oryginalną wiadomość.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się: liczba całkowita $n$&nbsp;($1 &le; n &le; 1\,000\,000$) oznaczająca długość wiadomości oraz znak $c$&nbsp;- wielka litera alfabetu łacińskiego występująca najczęściej w oryginalnej wiadomości; $n$&nbsp;i $c$&nbsp;są oddzielone pojedynczym odstępem. W drugim wierszu wejścia znajduje się zakodowana wiadomość, składająca się z $n$&nbsp;wielkich liter alfabetu łacińskiego, bez jakichkolwiek odstęp&oacute;w.</p>

### 출력

<p>Program powinien wypisać na standardowe wyjście jeden wiersz, zawierający odszyfrowaną oryginalną wiadomość. Możesz założyć, że jednoznaczne odtworzenie tej wiadomości będzie zawsze możliwe.</p>

### 힌트

<p>W powyższym przykładzie oryginalny tekst został przesunięty cyklicznie o $10$&nbsp;liter. Najczęściej (czterokrotnie) występuje w nim litera&nbsp;<code>A</code>.</p>