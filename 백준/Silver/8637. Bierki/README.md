# [Silver II] Bierki - 8637

[문제 링크](https://www.acmicpc.net/problem/8637)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 36, 맞힌 사람: 22, 정답 비율: 52.381%

### 분류

기하학, 이분 탐색, 두 포인터

### 문제 설명

<p>Jaś lubi budować tr&oacute;jkąty z bierek. W tym celu trzyma je w worku, z kt&oacute;rego wybiera trzy bierki na chybił-trafił. Bierki mogą mieć r&oacute;żne długości i nie zawsze Jaś może zbudować tr&oacute;jkąt, a wtedy wpada w histerię. Mama Jasia ma dość histerycznych napad&oacute;w synka i dlatego poprosiła Ciebie o pomoc. Należy odrzucić niekt&oacute;re bierki w taki spos&oacute;b, aby z pozostałych zawsze dało się ułożyć tr&oacute;jkąt, jednocześnie zostawiając jak najwięcej bierek w worku.</p>

<p>Opracuj program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia liczbę bierek w worku oraz ich długości,</li>
	<li>obliczy największa˛ liczbę bierek, kt&oacute;rą można pozostawić w worku, tak żeby z każdych trzech z nich można było utworzyć tr&oacute;jkąt,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu zapisano liczbę $N$&nbsp;($5 &le; N &le; 30\,000$), oznaczającą liczbę bierek w worku. W każdym z następnych $N$&nbsp;wierszy zapisano długość jednej bierki. Długość bierki jest liczbą całkowitą z przedziału $[1...500]$.</p>

### 출력

<p>W pierwszym wierszu wypisz liczbę bierek, kt&oacute;re powinny zostać w worku.</p>