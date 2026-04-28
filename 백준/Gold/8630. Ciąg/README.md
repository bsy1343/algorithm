# [Gold II] Ciąg - 8630

[문제 링크](https://www.acmicpc.net/problem/8630)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>Jaś niedawno usłyszał w szkole o ciągach liczbowych. Bardzo mu się one spodobały i szybko zaczął tworzyć swoje własne, długie sekwencje liczb. Jego najnowszym wymysłem jest ciąg $a$&nbsp;-&nbsp;<b>niemalejąca</b>&nbsp;sekwencja liczb naturalnych o następującej własności: dla każdej liczby naturalnej $k$&nbsp;zawiera ona dokładnie $a_k$&nbsp;wystąpień liczby $k$. (Zakładamy przy tym, że $0$&nbsp;nie jest liczbą naturalną). Innymi słowy, dla każdego $k$&nbsp;dokładnie $a_k$&nbsp;spośr&oacute;d liczb $a_1, a_2, a_3, \dots$&nbsp;jest r&oacute;wne $k$.</p>

<p>Pierwszych kilka wyraz&oacute;w ciągu udało się Jasiowi wypisać, ale kartka i długopis okazały się niewystarczające, aby wygenerować jakiś dłuższy początkowy fragment ciągu. Pom&oacute;ż Jasiowi uporać się z tym problemem.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia liczbę naturalną $n$,</li>
	<li>wyznaczy $n$-ty wyraz ciągu $a$,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>Pierwszy i jedyny wiersz wejścia zawiera jedną liczbę naturalną $n$&nbsp;($1 &le; n &le; 10^{18}$) - numer szukanego wyrazu ciągu.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę naturalną $a_n$.</p>

### 힌트

<p>$a_5 = 3$ oznacza, że w ciągu $a$&nbsp;liczba $5$&nbsp;występuje dokładnie $3$&nbsp;razy; dokładniej, $a_9 = a_{10} = a_{11} = 5$.</p>