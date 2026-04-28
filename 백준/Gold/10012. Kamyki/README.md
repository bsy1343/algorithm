# [Gold IV] Kamyki - 10012

[문제 링크](https://www.acmicpc.net/problem/10012)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 111, 정답: 47, 맞힌 사람: 24, 정답 비율: 48.980%

### 분류

수학, 정수론, 게임 이론

### 문제 설명

<p>Bituś i Bajtuś spędzają wakacje nad Morzem Bajtockim. Ale nawet na plaży, bardziej niż ciepły piasek i wysokie fale, interesują ich intelektualne rozrywki. Zgromadzili spory stosik okrągłych kamyk&oacute;w, kt&oacute;re morze wyrzuciło na brzeg, i rozpoczęli nową grę. Zasady są bardzo proste. Bituś w pierwszym ruchu może zabrać dowolną niezerową liczbę kamyk&oacute;w, pod warunkiem że nie zabierze wszystkich. Następnie chłopcy (zaczynając od Bajtusia) wykonują naprzemiennie ruchy, a w każdym ruchu mogą zabrać taką niezerową liczbę kamyk&oacute;w (włączając w to zabranie całego stosiku), jaka nie była zabrana w&nbsp;<i>żadnym</i>&nbsp;poprzednim ruchu. Innymi słowy, w każdym ruchu należy zabrać inną liczbę kamyk&oacute;w. Przegrywa ten, kto nie może wykonać ruchu.</p>

<p>Mając daną liczbę kamyk&oacute;w na początku gry i zakładając, że obaj chłopcy grają optymalnie, sprawdź, czy grę wygra Bituś.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita&nbsp;<em>t</em>&nbsp;(1 &le; <em>t</em> &le; 1 000 000), oznaczająca liczbę przypadk&oacute;w testowych do rozważenia.</p>

<p>W każdym z kolejnych&nbsp;<em>t</em>&nbsp;wierszy znajduje się po jednej liczbie całkowitej&nbsp;<em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000 000 000), kt&oacute;ra oznacza liczbę kamyk&oacute;w na początku gry.</p>

### 출력

<p>Na wyjście należy wypisać dokładnie <em>t</em>&nbsp;wierszy zawierających odpowiedzi dla kolejnych przypadk&oacute;w testowych z wejścia. Każdy wiersz powinien zawierać słowo&nbsp;<code>TAK</code>&nbsp;lub&nbsp;<code>NIE</code>, w zależności od tego, czy Bituś wygra grę.</p>