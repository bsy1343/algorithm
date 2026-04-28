# [Gold IV] Ispit - 17049

[문제 링크](https://www.acmicpc.net/problem/17049)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 25, 맞힌 사람: 18, 정답 비율: 41.860%

### 분류

브루트포스 알고리즘, 문자열, 두 포인터

### 문제 설명

<p>After 26 years of studying, little Mirko took his potentially last exam. He confidently took his seat, sharpened his pencil and waited calmly for the professor&#39;s permission to start writing &ndash; after all, that was his favorite subject, Data Structures and Algorithms. But, as in any good story, this one also has that but... Namely, when he got his exam, Mirko could not even comprehend what was written in it. He only saw a meaningless matrix of letters with N rows and N columns.</p>

<p>Since the professor forbid leaving the classroom during the exam, Mirko decided to spend 2 hours coming up with his own task. Mirko was wondering if it is possible to select K consecutive columns of the matrix so that, after arbitrarily shuffling letters in the K selected columns&rsquo; rows, there are two equal rows of the matrix. Shuffling is allowed only inside of the same row within selected columns and it is possible that a row remains unchanged after such operation.</p>

<p>Can you solve Mirko&#39;s task?</p>

### 입력

<p>In the first line of the input there are two integer numbers N and K (2 &le; K &le; N &le; 500).</p>

<p>The following N rows contain N lowercase letters of the english alphabet describing the matrix of the letters Mirko saw in the exam.</p>

### 출력

<p>Print &ldquo;DA&rdquo; (Croatian for yes, without the quotation marks) if it is possible to select the K consecutive columns that meet the conditions of the task. Otherwise print &ldquo;NE&rdquo; (Croatian for no, also without quotation marks).</p>