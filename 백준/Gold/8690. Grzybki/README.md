# [Gold II] Grzybki - 8690

[문제 링크](https://www.acmicpc.net/problem/8690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 11, 맞힌 사람: 9, 정답 비율: 21.951%

### 분류

누적 합

### 문제 설명

<p>W bajtockim lesie rosną r&oacute;żne gatunki grzybk&oacute;w. Niedawno znany grzybiarz, Pan Stanisław, odkrył nowy, bardzo smaczny gatunek grzyba, kt&oacute;ry nazwał&nbsp;<i>Staśkiem</i>.</p>

<p><i>Staśki</i>&nbsp;charakteryzują się tym, że można w łatwy spos&oacute;b przewidzieć, o ile zwiększa się dziennie ich waga. Niestety, każdy grzyb po pewnej liczbie dni staje się grzybem trującym. Jednak dla Pana Stanisława nie jest to problem, ponieważ jako jeden z nielicznych, widząc dany grzyb, umie stwierdzić po ilu dniach będzie on niezdatny do spożycia.</p>

<p>Pan Stanisław wybrał się dzisiaj do bajtockiego lasu i spisał dane o wszystkich grzybach, kt&oacute;re widział. Teraz zastanawia się, po ilu dniach ma wr&oacute;cić do lasu, aby zebrać jak najwięcej (według wagi) grzyb&oacute;w. Pan Stanisław, mając do wyboru kilka termin&oacute;w, zawsze wybiera najwcześniejszy. Żona Pana Stanisława zabrania mu chodzenia dwa razy do lasu jednego dnia, czyli Pan Stanisław&nbsp;<b>nie może wr&oacute;cić</b>&nbsp;do lasu po 0 dniach.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę grzyb&oacute;w. W&nbsp;<em>n</em>&nbsp;następnych wierszach znajduje się opis kolejnych grzyb&oacute;w. Każdy wiersz zawiera trzy liczby całkowite <em>m</em>, <em>p</em>, <em>d</em>&nbsp;(1 &le; <em>m</em>, <em>p</em>, <em>d</em> &le; 10<sup>5</sup>), oznaczające odpowiednio aktualną masę, przyrost wagi oraz ile dni dany grzyb jest zdatny do spożycia.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną liczbie dni, po kt&oacute;rych Pan Stanisław ma wr&oacute;cić po grzyby.</p>

### 힌트

<ul>
	<li>po jednym dniu - masy grzyb&oacute;w to odpowiednio: (2, 10, 9),</li>
	<li>po dw&oacute;ch dniach - pierwszy grzyb jest niejadalny, masy grzyb&oacute;w: (0, 15, 11),</li>
	<li>po trzech dniach- można jeść tylko trzeci grzyb, masy grzyb&oacute;w: (0, 0, 13),</li>
	<li>po czterech dniach - żaden grzyb nie nadaje się do jedzenia: (0, 0, 0).</li>
</ul>

<p>Jadalne grzyby najwięcej ważą 26 (po dw&oacute;ch dniach).</p>