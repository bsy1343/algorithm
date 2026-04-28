# [Platinum III] Email Filing - 24619

[문제 링크](https://www.acmicpc.net/problem/24619)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 97, 정답: 47, 맞힌 사람: 41, 정답 비율: 55.405%

### 분류

구현, 자료 구조, 그리디 알고리즘, 집합과 맵

### 문제 설명

<p>Farmer John has fallen behind on organizing his inbox. The way his screen is organized, there is a vertical list of folders on the left side of the screen and a vertical list of emails on the right side of the screen. There are $M$ total folders, numbered $1 \ldots M$ ($1 \le M \le 10^4)$. His inbox currently contains $N$ emails numbered $1\ldots N$ ($1 \le N \le 10^5$); the $i$th email needs to be filed into folder $f_i$ ($1\le f_i\le M$).</p>

<p>FJ&#39;s screen is rather small, so he can only view $K$ ($1\le K\le \min(N,M)$) folders and $K$ emails at once. Initially, his screen starts out displaying folders $1 \ldots K$ on the left and emails $1 \ldots K$ on the right. To access other folders and emails, he needs to scroll through these respective lists. For example, if he scrolls down one position in the list of folders, his screen will display folders $2 \ldots K+1$, and then scrolling down one position further it will display folders $3 \ldots K+2$. When FJ drags an email into a folder, the email disappears from the email list, and the emails after the one that disappeared shift up by one position. For example, if emails $1, 2, 3, 4, 5$ are currently displayed and FJ drags email 3 into its appropriate folder, the email list will now show emails $1, 2, 4, 5, 6$. FJ can only drag an email into the folder to which it needs to be filed.</p>

<p>Unfortunately, the scroll wheel on FJ&#39;s mouse is broken, and he can only scroll downwards, not upwards. The only way he can achieve some semblance of upward scrolling is if he is viewing the last set of $K$ emails in his email list, and he files one of these. In this case, the email list will again show the last $K$ emails that haven&#39;t yet been filed, effectively scrolling the top email up by one. If there are fewer than $K$ emails remaining, then all of them will be displayed.</p>

<p>Please help FJ determine if it is possible to file all of his emails.</p>

### 입력

<p>The first line of input contains $T$ ($1 \le T \le 10$), the number of subcases in this input, all of which must be solved correctly to solve the input case. The $T$ subcases then follow. For each subcase, the first line of input contains $M$, $N$, and $K$. The next line contains $f_1 \ldots f_N$.</p>

<p>It is guaranteed that the sum of $M$ over all subcases does not exceed $10^4$, and that the sum of $N$ over all subcases does not exceed $10^5$.</p>

### 출력

Output $T$ lines, each one either containing either YES or NO, specifying
whether FJ can successfully file all his emails in each of the $T$ subcases.