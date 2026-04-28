# [Silver I] Liczby pechowe - 26777

[문제 링크](https://www.acmicpc.net/problem/26777)

### 성능 요약

시간 제한: 12 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 39, 맞힌 사람: 24, 정답 비율: 88.889%

### 분류

백트래킹

### 문제 설명

<p>Liczbę naturalną nazywamy pechową, jeśli spełnia jednocześnie następujące dwa warunki:</p>

<ul>
	<li>jej suma cyfr wynosi 13,</li>
	<li>zawiera co najmniej raz w swoim zapisie dziesiętnym ciąg 13 jako sp&oacute;jny fragment (czyli zawiera cyfry 1 i 3 stojące obok siebie).</li>
</ul>

<p>Przykładowo, liczby 139, 33133 są pechowe, natomiast 13 oraz 553 nie są liczbami pechowymi.</p>

<p>Napisz program, kt&oacute;ry wczyta liczbę naturalną N, wyznaczy ile jest liczb pechowych nie przekraczających N i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 10<sup>13</sup>).</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinna się znaleźć jedna liczba całkowita &ndash; liczba liczb pechowych nie przekraczających N.</p>