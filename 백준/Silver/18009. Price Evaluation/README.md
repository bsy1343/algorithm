# [Silver IV] Price Evaluation - 18009

[문제 링크](https://www.acmicpc.net/problem/18009)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 150, 정답: 78, 맞힌 사람: 58, 정답 비율: 54.717%

### 분류

구현, 자료 구조, 문자열, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>One day, da Vinci found his workspace piled with completed paintings, making it difficult to move around. He then sent out his favorite student, Francesco Melzi, to sell one of these artworks. Da Vinci decided to determine the price in a quite simple way: he firstly assigned a price to each possible property (style, subject, season, weather, etc.), then named several properties of the painting to sell, and set the price of it to be the sum of prices of these properties. After that, da Vinci told Francesco Melzi the assignment of prices and the properties of that painting.</p>

<p>When Francesco set out to sell the artwork, he forgot some of its properties but memorized the price of each property very well. He wondered according to the information he remembered, what would the painting&rsquo;s minimum and maximum possible price be?</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 10, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers n, m with 1 &le; m &le; n &le; 100: n is the number of all possible properties, and m is the number of properties of the artwork to sell. This is followed by n lines, each with a string s<sub>i</sub> and an integer 0 &le; c<sub>i</sub> &le; 10000 separated by space, where s<sub>i</sub> is the name of the i-th property and c<sub>i</sub> is the price assigned to it. s<sub>i</sub> is a non-empty string consisting of at most 80 lowercase letters. All s<sub>i</sub>&rsquo;s are unique, but c<sub>i</sub>&rsquo;s are not necessarily unique.</p>

<p>Next is a line containing m strings p<sub>j</sub> separated by space: the properties this artwork has. If p<sub>j</sub> is ?, then it is an unknown property, otherwise p<sub>j</sub> would be one of the properties s<sub>i</sub>. No known property will appear twice.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then, output the minimum and maximum possible price of the artwork on a single line.</p>

<p>Each data set should be followed by a blank line.</p>