# [Platinum V] Copying Books - 3487

[문제 링크](https://www.acmicpc.net/problem/3487)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 508, 정답: 172, 맞힌 사람: 127, 정답 비율: 34.511%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Before the invention of book-printing, it was very hard to make a copy of a book. All the contents had to be re-written by hand by so called&nbsp;<em>scribers</em>. The scriber had been given a book and after several months he finished its copy. One of the most famous scribers lived in the 15th century and his name was Xaverius Endricus Remius Ontius Xendrianus (<em>Xerox</em>). Anyway, the work was very annoying and boring. And the only way to speed it up was to hire more scribers.</p>

<p>Once upon a time, there was a theater ensemble that wanted to play famous Antique Tragedies. The scripts of these plays were divided into many books and actors needed more copies of them, of course. So they hired many scribers to make copies of these books. Imagine you have&nbsp;<var>m</var>&nbsp;books (numbered&nbsp;<var>1, 2 ... m</var>) that may have different number of pages (<var>p<sub>1</sub>, p<sub>2</sub>&nbsp;... p<sub>m</sub></var>) and you want to make one copy of each of them. Your task is to divide these books among&nbsp;<var>k</var>&nbsp;scribes,&nbsp;<var>k &lt;= m</var>. Each book can be assigned to a single scriber only, and every scriber must get a continuous sequence of books. That means, there exists an increasing succession of numbers&nbsp;<var>0 = b<sub>0</sub>&nbsp;&lt; b<sub>1</sub>&nbsp;&lt; b<sub>2</sub>, ... &lt; b<sub>k-1</sub>&nbsp;&le; b<sub>k</sub>&nbsp;= m</var>&nbsp;such that&nbsp;<var>i</var>-th scriber gets a sequence of books with numbers between&nbsp;<var>b<sub>i-1</sub>+1</var>&nbsp;and&nbsp;<var>b<sub>i</sub></var>. The time needed to make a copy of all the books is determined by the scriber who was assigned the most work. Therefore, our goal is to minimize the maximum number of pages assigned to a single scriber. Your task is to find the optimal assignment.</p>

### 입력

<p>The input consists of&nbsp;<var>N</var>&nbsp;cases. The first line of the input contains only positive integer&nbsp;<var>N</var>. Then follow the cases. Each case consists of exactly two lines. At the first line, there are two integers&nbsp;<var>m</var>&nbsp;and&nbsp;<var>k</var>,&nbsp;<var>1 &le; k &le;&nbsp;m &le;&nbsp;500</var>. At the second line, there are integers&nbsp;<var>p<sub>1</sub>, p<sub>2</sub>, ... p<sub>m</sub></var>&nbsp;separated by spaces. All these values are positive and less than 100,000,000.</p>

### 출력

<p>For each case, print exactly one line. The line must contain the input succession&nbsp;<var>p<sub>1</sub>, p<sub>2</sub>, ... p<sub>m</sub></var>&nbsp;divided into exactly&nbsp;<var>k</var>&nbsp;parts such that the maximum sum of a single part should be as small as possible. Use the slash character (&#39;<code>/</code>&#39;) to separate the parts. There must be exactly one space character between any two successive numbers and between the number and the slash.</p>

<p>If there is more than one solution, print the one that minimizes the work assigned to the first scriber, then to the second scriber etc. But each scriber must be assigned at least one book.</p>