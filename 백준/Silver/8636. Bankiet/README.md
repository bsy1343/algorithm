# [Silver II] Bankiet - 8636

[문제 링크](https://www.acmicpc.net/problem/8636)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 43, 맞힌 사람: 37, 정답 비율: 94.872%

### 분류

그래프 이론, 순열 사이클 분할

### 문제 설명

<p>W restauracji Utalentowany Miś zaplanowano bankiet dla finalist&oacute;w OIG. Goście zasiądą przy okrągłych stołach w ściśle określony spos&oacute;b. Kierownik sali otrzymał listę gości wraz z informacją, kto ma siedzieć z lewej strony każdego z nich. Ile stoł&oacute;w musi przygotować na bankiet?</p>

<p>Opracuj program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia informacje o rozmieszczeniu gości,</li>
	<li>obliczy ile stoł&oacute;w trzeba przygotować,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu zapisano liczbę gości $N$&nbsp;($1 &le; N &le; 30\,000$). Goście są ponumerowani kolejnymi liczbami naturalnymi od $1$&nbsp;do $N$. W drugim wierszu zapisano numer gościa siedzącego po lewej stronie pierwszego gościa. w trzecim wierszu zapisano numer gościa siedzącego po lewej stronie drugiego gościa itd. W $i$-tym wierszu zapisano numer gościa siedzącego po lewej stronie ($i-1$)-tego gościa. W $N+1$-szym wierszu zapisano numer gościa siedzącego po lewej stronie $N$-tego gościa.</p>

### 출력

<p>W pierwszym wierszu wypisz liczbę stolik&oacute;w potrzebnych do usadzenia wszystkich gości.</p>