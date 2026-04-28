# [Platinum III] Palindrom - 26640

[문제 링크](https://www.acmicpc.net/problem/26640)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 4 MB

### 통계

제출: 116, 정답: 49, 맞힌 사람: 28, 정답 비율: 32.941%

### 분류

문자열, 해싱

### 문제 설명

<p>Zwr&oacute;ć uwagę na niewielki limit pamięci w tym zadaniu.</p>

<p>Komputery lądujących na Księżycu rakiet Apollo miały 71 kilobajt&oacute;w pamięci operacyjnej. W tym zadaniu będziesz miał do dyspozycji więcej, bo aż 4 MB pamięci, a Twoje zadanie będzie prostsze: musisz sprawdzić, czy dane na wejściu słowo jest palindromem. Przypominamy, że palindrom to słowo, kt&oacute;re czytane od lewej do prawej jest takie samo, jak czytane od prawej do lewej, na przykład kajak albo inni.</p>

<p>Aby nie było zupełnie prosto, w niekt&oacute;rych testach długość słowa nie będzie znana przed jego wczytaniem.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się pojedyncza liczba n. W niekt&oacute;rych grupach test&oacute;w będzie to pewna liczba dodatnia &ndash; w takim wypadku oznacza ona długość słowa, kt&oacute;re będzie podane w drugim wierszu. W innych grupach test&oacute;w będzie n = 0, co oznacza, że trzeba czytać słowo z wejścia nie znając jego długości.</p>

<p>Drugi wiersz zawiera słowo do sprawdzenia, złożone z małych liter alfabetu angielskiego. Słowo to nie jest puste, a jego długość nie przekracza 20 000 000 znak&oacute;w.</p>

<p>Możesz założyć, że w każdej grupie test&oacute;w albo wszystkie testy mają n &gt; 0, albo we wszystkich jest n = 0.</p>

### 출력

<p>Należy wypisać jeden wiersz zawierający <code>TAK</code> lub <code>NIE</code> w zależności od tego, czy dane słowo jest palindromem.</p>