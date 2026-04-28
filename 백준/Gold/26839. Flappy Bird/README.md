# [Gold II] Flappy Bird - 26839

[문제 링크](https://www.acmicpc.net/problem/26839)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 8, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

구현, 그리디 알고리즘, 정렬, 홀짝성, 불변량 찾기

### 문제 설명

<p>Od czasu, gdy Bajtazar zainstalował na swoim telefonie kom&oacute;rkowym grę Flappy Bird, nie może się od niej oderwać. Stał się w nią tak dobry, że bez problemu wygrywa nawet najtrudniejszy poziom gry. Postawił sobie zatem nowy cel, aby robić to minimalnym wysiłkiem. Poprosił Cię, abyś napisał program komputerowy, kt&oacute;ry mu w tym pomoże.</p>

<p>W tym celu Bajtazar musi sformalizować opis rozgrywki. W każdym momencie gry postać ptaszka, kt&oacute;rą kontroluje gracz, może znajdować się w jednym z punkt&oacute;w prostokątnego układu wsp&oacute;łrzędnych. Początkowo znajduje się on w punkcie (0, 0), a gracz wygrywa, jeśli doprowadzi go do dowolnego punktu o pierwszej wsp&oacute;łrzędnej r&oacute;wnej X.</p>

<p>W każdej sekundzie ptaszek znajdujący się w punkcie (x, y) zmienia swoje położenie na jeden z dw&oacute;ch sposob&oacute;w. Jeśli gracz stuknie palcem w ekran telefonu, to ptaszek przemieści się do punktu (x+ 1, y + 1). Jeśli natomiast gracz nic nie zrobi, ptaszek przemieści się do punktu (x + 1, y &minus; 1).</p>

<p>Dodatkowo na ptaszka czyha n przeszk&oacute;d. Każda z nich składa się z dw&oacute;ch p&oacute;łprostych zabronionych. Jeśli ptaszek znajdzie się w kt&oacute;rymkolwiek z punkt&oacute;w p&oacute;łprostych zabronionych, gra natychmiast kończy się przegraną gracza. Przeszkoda i-ta opisywana jest tr&oacute;jką liczb (x<sub>i</sub>, a<sub>i</sub>, b<sub>i</sub>), kt&oacute;re oznaczają, że punkty (x<sub>i</sub>, y) dla y &le; a<sub>i</sub> oraz punkty (x<sub>i</sub>, y) dla y &ge; b<sub>i</sub> należą do p&oacute;łprostych zabronionych (na rysunku poniżej p&oacute;łproste te przedstawiono jako wąskie prostokąty).</p>

<p>Dla danego zestawu przeszk&oacute;d Bajtazar chciałby dowiedzieć się, ile minimalnie razy musi stuknąć palcem w ekran, aby wygrać.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite n i X (0 &le; n &le; 500 000; 1 &le; X &le; 109 ) oznaczające liczbę przeszk&oacute;d i położenie mety. Kolejne n wierszy zawiera opis przeszk&oacute;d; i-ty z nich zawiera trzy liczby całkowite x<sub>i</sub>, a<sub>i</sub> i b<sub>i</sub> (0 &lt; x<sub>i</sub> &lt; X; a<sub>i</sub> &lt; b<sub>i</sub> ; a<sub>i</sub>, b<sub>i</sub> &isin; [&minus;10<sup>9</sup>, 10<sup>9</sup>]) oznaczające położenie i-tej przeszkody. Przeszkody są uporządkowane od lewej do prawej, tzn. x<sub>1</sub> &lt; x<sub>2</sub> &lt; . . . &lt; x<sub>n</sub>.</p>

### 출력

<p>Jeśli dla danego zestawu przeszk&oacute;d wygrana nie jest możliwa, w jedynym wierszu standardowego wyjścia należy wypisać jedno słowo <code>NIE</code>. W przeciwnym wypadku należy wypisać nieujemną liczbę całkowitą oznaczającą minimalną liczbę stuknięć w ekran telefonu, niezbędną by doprowadzić do wygranej.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26839.%E2%80%85Flappy%E2%80%85Bird/f3ad3f93.png" data-original-src="https://upload.acmicpc.net/75143458-7a1d-4237-9199-1c6536647fc8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 330px; height: 200px;" /></p>

<p style="text-align: center;">Rysunek odpowiada pierwszemu testowi przykładowemu. Strzałkami oznaczono pozycje, w kt&oacute;rych gracz stuka w ekran telefonu.</p>