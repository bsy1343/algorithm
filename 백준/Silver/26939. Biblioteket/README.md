# [Silver III] Biblioteket - 26939

[문제 링크](https://www.acmicpc.net/problem/26939)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 25, 맞힌 사람: 20, 정답 비율: 58.824%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Du jobbar p&aring; ett bibliotek och vill st&auml;lla tillbaka ett antal b&ouml;cker i hyllorna. Hyllorna &auml;r placerade l&auml;ngs $x$-axeln. Givet i vilken hylla varje bok ska st&aring; (en $x$-koordinat mellan $-1\,000$ och $1\,000$) och det maximala antalet b&ouml;cker som du kan b&auml;ra samtidigt, best&auml;m den kortaste str&auml;ckan du m&aring;ste g&aring; f&ouml;r att st&auml;lla tillbaka alla b&ouml;cker. B&ouml;ckerna som ska st&auml;llas tillbaka befinner sig ursprungligen p&aring; position $0$. Du beh&ouml;ver inte g&aring; tillbaka efter att ha &aring;terst&auml;llt den sista boken. </p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r tv&aring; heltal: antalet b&ouml;cker som ska st&auml;llas tillbaka $N$, d&auml;r $1 \le N \le 100$, och antalet b&ouml;cker du kan b&auml;ra samtidigt $K$, d&auml;r $1 \le K \le 100$. Sedan f&ouml;ljer $N$ rader med ett heltal p&aring; varje rad, x-koordinaten f&ouml;r den hylla d&auml;r varje bok ska st&aring;. </p>

### 출력

<p>Programmet ska skriva ut en rad med ett heltal: den minimala str&auml;ckan du m&aring;ste g&aring; f&ouml;r att s&auml;tta tillbaka alla b&ouml;ckerna. </p>

### 힌트

<p>Du kan exempelvis b&ouml;rja med att ta med dig b&ouml;ckerna som ska till hylla 3 och 4. D&auml;refter h&auml;mtar du boken som ska till hylla 1 och slutligen tar du boken som ska till hylla -4. </p>