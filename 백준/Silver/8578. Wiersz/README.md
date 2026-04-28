# [Silver III] Wiersz - 8578

[문제 링크](https://www.acmicpc.net/problem/8578)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 14, 맞힌 사람: 13, 정답 비율: 50.000%

### 분류

구현, 문자열

### 문제 설명

<p>Bajtłomiej zabrał się za pisanie wierszy. Jest nowatorskim i oryginalnym tw&oacute;rcą. Jego gł&oacute;wnym problemem jest dobieranie sł&oacute;w i wers&oacute;w tak, by się rymowały. Bajtłomiej uznaje za rymujące się takie dwa wersy, kt&oacute;re zawierają po tyle samo samogłosek (Za samogłoski uznajemy litery&nbsp;<code>a</code>, <code>e</code>, <code>i</code>, <code>o</code>, <code>u</code>, <code>y</code>), a ich fragmenty złożone z ostatnich $k$&nbsp;liter (z pominięciem odstęp&oacute;w) są takie same. Wersy składające się z mniej niż $k$&nbsp;liter uznaje za zbyt kr&oacute;tkie, by je było traktować jako rymujące się z czymkolwiek.</p>

<p>Twoim zadaniem jest określenie, ile z podanych par wers&oacute;w rymuje się (zgodnie z definicją Bajtazara).</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby, $n$&nbsp;i $k$&nbsp;($1 &le; n &le; 1\,000$, $1 &le; k &le; 1\,000$), oznaczające liczbę par wers&oacute;w do sprawdzenia i długość fragment&oacute;w końcowych, decydujących o tym, czy słowa mogą się rymować. W kolejnych $2n$&nbsp;wierszach znajdują się pary wers&oacute;w, z kt&oacute;rych każdy wers zapisany jest w osobnym wierszu i składa się z małych liter alfabetu angielskiego.</p>

<p>Długość wersu (wliczając odstępy) nigdy nie przekroczy $2\,000$. Możesz założyć, że w przypadkach testowych wartych łącznie co najmniej $80\%$&nbsp;punkt&oacute;w w żadnym wersie nie pojawią się odstępy.</p>

### 출력

<p>Na standardowe wyjście wypisz liczbę rymujących się par wers&oacute;w.</p>