# [Gold III] Język polski - 26636

[문제 링크](https://www.acmicpc.net/problem/26636)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

두 포인터

### 문제 설명

<p>Bajtek, najmłodszy pracownik nowo otwartej ambasady Bajtocji w Polsce, przekonuje się na każdym kroku, że język polski może być trudny dla zagranicznych gości. Szczeg&oacute;lny problem sprawiają mu słowa, w kt&oacute;rych występują po kolei trzy sp&oacute;łgłoski (takie jak &bdquo;kostka&rdquo; albo &bdquo;potyczki&rdquo;) bądź też trzy samogłoski<sup>&lowast;</sup> (&bdquo;geoinżynieria&rdquo;, &bdquo;nieautoryzowany&rdquo;) &ndash; takich sł&oacute;w nie jest w stanie wym&oacute;wić, co czyni z niego wdzięczny obiekt niewybrednych żart&oacute;w koleg&oacute;w.</p>

<p>Zbliżają się święta Bożego Narodzenia i dział PR wpadł na genialny (jak sądzi) pomysł: nagranie filmu z życzeniami dla Polak&oacute;w, kt&oacute;re będą po kolei odczytywać Bajtocjanie. Pełen tekst życzeń został już rozesłany do wszystkich pracownik&oacute;w ambasady. Tekst jest napisem nie zawierającym spacji (pracownicy w większości znają polski nie lepiej niż Bajtek, więc podział na słowa tylko by im przeszkadzał), ani polskich znak&oacute;w (tak naprawdę nikt nie chce wiedzieć, jak statystyczny Bajtocjanin czyta &bdquo;ź&rdquo;).</p>

<p>Bajtek nie wie jeszcze, kt&oacute;ry kawałek życzeń dostanie do przeczytania, ale chciałby ocenić, jak marnie wyglądają jego szanse. Oblicz, ile jest możliwych fragment&oacute;w tekstu, kt&oacute;rych (ze względu na trzy kolejne sp&oacute;łgłoski lub samogłoski) nie będzie w stanie wym&oacute;wić.</p>

<hr />
<p><sup>&lowast;</sup>Na wszelki wypadek przypominamy, że samogłoskami są litery &bdquo;a&rdquo;, &bdquo;e&rdquo;, &bdquo;i&rdquo;, &bdquo;o&rdquo;, &bdquo;u&rdquo; oraz &bdquo;y&rdquo;.</p>

### 입력

<p>W pierwszym i jedynym wierszu wejścia znajduje się napis złożony z małych liter alfabetu angielskiego, zawierający co najmniej jeden i co najwyżej 200 000 znak&oacute;w.</p>

### 출력

<p>Na wyjście Tw&oacute;j program powinien wypisać jedną liczbę całkowitą &ndash; liczbę fragment&oacute;w tekstu, kt&oacute;re są trudne dla Bajtka. Jeśli w dw&oacute;ch (lub więcej) miejscach tekstu występuje identyczny trudny fragment, należy go policzyć wielokrotnie.</p>