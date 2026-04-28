# [Silver V] Vaccin - 21367

[문제 링크](https://www.acmicpc.net/problem/21367)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 45, 맞힌 사람: 41, 정답 비율: 67.213%

### 분류

구현, 이분 탐색

### 문제 설명

<p>Fredrika och hennes v&auml;nner g&aring;r och v&auml;ntar p&aring; deras covid-19-vaccin. De undrar s&aring; innerligt n&auml;r de ska f&aring; sitt vaccin att de har ordnat fram klassificerad information fr&aring;n staten om vaccineringen. N&auml;rmare best&auml;mt vet de att det &auml;r $n_i$ personer innan v&auml;n $i$ i k&ouml;n, och de vet hur m&aring;nga som f&aring;r vaccin varje dag. Hj&auml;lp dem att r&auml;kna ut n&auml;r Fredrika och var och en av hennes v&auml;nner blir vaccinerade.&nbsp;</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal $N$ och $Q$ ($1 \le N,Q \le 100\,000$) -- &nbsp;antalet dagar de vet hur m&aring;nga som f&aring;r vaccin p&aring; och antalet v&auml;nner, inklusive Fredrika, som vill veta n&auml;r de f&aring;r sitt vaccin. N&auml;sta rader inneh&aring;ller $N$ heltal $0 \le k_j \le 15$ -- antalet personer som f&aring;r vaccin dag $j$ ($1 \le j \le N$). D&auml;refter f&ouml;ljer en rad med $Q$ heltal $0 \le p_i \le 10^6$ -- antalet personer framf&ouml;r $i$ i k&ouml;n.</p>

### 출력

<p>Skriv ut $Q$ rader d&auml;r dagen d&aring; person $i$ f&aring;r sitt vaccin p&aring; skrivs ut p&aring; rad $i$. Om n&aring;gon &auml;r s&aring; l&aring;ngt bak i k&ouml;n att du inte vet n&auml;r de f&aring;r sitt vaccin, skriv ut $-1$.</p>