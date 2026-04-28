# [Platinum V] Wojna - 8248

[문제 링크](https://www.acmicpc.net/problem/8248)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

그리디 알고리즘, 게임 이론

### 문제 설명

<p>Jaś gra ze Stasiem w Bajtocką Wojnę. Na początku rozgrywki każdy z graczy otrzymuje stos <em>n</em>&nbsp;kart. Na każdej z kart zapisana jest jedna liczba. Gra toczy się w turach. W czasie tury każdy gracz wyciąga dwie karty z wierzchu swojej talii i podejmuje decyzję, kt&oacute;rą z nich odrzucić, a kt&oacute;rą przekazać przeciwnikowi (w każdym ruchu jedną z kart należy odrzucić, a drugą przekazać przeciwnikowi). Przeciwnik wkłada otrzymaną kartę pod sp&oacute;d swojej talii.</p>

<p>Gra kończy się w momencie, gdy obaj gracze mają po jednej karcie. Jeśli liczba zapisana na karcie Jasia to <em>j</em>, a liczba na karcie Stasia jest r&oacute;wna <em>s</em>, to Jaś otrzymuje&nbsp;<em>j</em> - <em>s</em>&nbsp;punkt&oacute;w, a Staś <em>s</em> - <em>j</em>&nbsp;punkt&oacute;w.</p>

<p>Zakładamy, że gracze grają optymalnie (maksymalizują sw&oacute;j wynik liczony zgodnie z powyższą regułą). Ile punkt&oacute;w uda się zdobyć Jasiowi?</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000 000) oznaczająca liczbę kart, kt&oacute;re otrzymali gracze. W drugim wierszu znajduje się ciąg <em>n</em>&nbsp;liczb całkowitych <em>a<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 1 000 000), kt&oacute;ry opisuje kolejne karty w talii Jasia, począwszy od karty na wierzchu talii. Trzeci wiersz opisuje karty w talii Stasia, w analogicznym formacie.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jedną liczbę całkowitą - liczbę punkt&oacute;w, kt&oacute;re zdobędzie Jaś, przy założeniu optymalnej gry obu graczy.</p>