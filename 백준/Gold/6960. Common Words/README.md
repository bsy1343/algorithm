# [Gold IV] Common Words - 6960

[문제 링크](https://www.acmicpc.net/problem/6960)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 12, 맞힌 사람: 9, 정답 비율: 27.273%

### 분류

구현, 자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Given a sequence of $m$ words from a newspaper article and an integer $k$, find the $k^\text{th}$ most common word(s).</p>

### 입력

<p>Input will consist of an integer $n$ followed by $n$ data sets. Each data set begins with a line containing $m$ and $k$, followed by $m$ lines, each containing a word of up to $20$ lowercase letters. There will be no more than $1\,000$ words per data set.</p>

### 출력

<p>For each input data set, determine the $k^\text{th}$ most common word(s). To be precise, a word $w$ is the $k^\text{th}$ most common if exactly $k-1$ distinct words occur more frequently than $w$ in the data set. Note that $w$ might be multiply defined (i.e. there is a tie for the $k^\text{th}$ most common word) or $w$ might not exist (i.e. there is no $k^\text{th}$ most common word). For each data set, print a title line indicating $k$ using normal ordinal notation (1st, 2nd, 3rd, 4th, 5th, &hellip;) followed by a number of lines giving all the possible values for the $k^\text{th}$ most common word. A blank line should follow the last word for each data set.</p>