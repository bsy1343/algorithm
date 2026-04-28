# [Silver V] Park - 8582

[문제 링크](https://www.acmicpc.net/problem/8582)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 334, 정답: 175, 맞힌 사람: 136, 정답 비율: 58.621%

### 분류

구현, 다이나믹 프로그래밍

### 문제 설명

<p>Bajtocki Park Narodowy słynie z długiego (choć niezbyt szerokiego) pasma g&oacute;rskiego, rozciągającego się przez cały park z zachodu na wsch&oacute;d. Co roku przyjeżdżają do niego tłumy turyst&oacute;w, kt&oacute;rzy często nie są zbyt rozgarnięci. Dlatego zarząd parku postanowił przygotować mapę całego pasma, podzieloną na fragmenty r&oacute;wnej długości. Przy każdym punkcie podziału zarząd zamierza umieścić wysokość tego punktu oraz dwie inne liczby: wysokość najwyższego punktu podziału na zach&oacute;d od niego oraz na wsch&oacute;d od niego.</p>

<p>Cała mapa jest już właściwie gotowa. Pozostaje jedynie obliczyć maksymalne wysokości na zach&oacute;d i na wsch&oacute;d od każdego punktu podziału. Zarząd parku poprosił Cię o napisanie programu, kt&oacute;ry wyznaczy te wartości.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 1\,000\,000$) oznaczająca długość pasma g&oacute;rskiego. W każdym z następnych $n$&nbsp;wierszy znajduje się po jednej liczbie całkowitej $w_i$&nbsp;($1&le; w_i &le; 1\,000\,000\,000$) oznaczającej wysokość $i$-tego punktu podziału. Punkty te podane są w kolejności z zachodu na wsch&oacute;d.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dokładnie $n$&nbsp;wierszy, odpowiadających kolejnym punktom podziału (w kolejności z zachodu na wsch&oacute;d). W każdym z tych wierszy powinny znaleźć się dwie liczby całkowite $a_i$&nbsp;oraz $b_i$&nbsp;oddzielone pojedynczym odstępem - wysokość najwyższego punktu podziału na zach&oacute;d od punktu $i$&nbsp;oraz na wsch&oacute;d od niego. W przypadku, gdy na zach&oacute;d od punktu $i$&nbsp;nie ma szczytu wyższego niż $w_i$, przyjmujemy $a_i = w_i$. Podobnie, jeśli na wsch&oacute;d od punktu $i$&nbsp;nie ma szczytu wyższego niż $w_i$, to przyjmujemy $b_i = w_i$.</p>