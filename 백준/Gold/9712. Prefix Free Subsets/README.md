# [Gold II] Prefix Free Subsets - 9712

[문제 링크](https://www.acmicpc.net/problem/9712)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 83, 정답: 45, 맞힌 사람: 24, 정답 비율: 63.158%

### 분류

수학, 다이나믹 프로그래밍, 자료 구조, 문자열, 트리, 조합론, 트라이

### 문제 설명

<p>A prefix-free set is a set of words in which no element is a prefix of another element in the set. For example {&quot;hello&quot;} , {&quot;hello&quot;, &quot;goodbye&quot;, &quot;giant&quot;, &quot;hi&quot;} and the empty set are examples of prefix-free sets. On the other hand, {&quot;hello&quot;,&quot;hell&quot;} and {&quot;great&quot;,&quot;gig&quot;,&quot;g&quot;} are not prefix-free. You will be given a set of words, and you must calculate the number of subsets of words that are prefix-free. Note that both the empty set and the entire set count as subsets.</p>

### 입력

<p>The first line of the input gives an integer T, which is the number of test cases. Each test case starts with a line containing N the number of words in the set. N is between 1 and 62 inclusive. Each of the next N line contains a word. The word contains only lowercase letter and length will not exceed 100. </p>

### 출력

<p>For each test case, the output contains a line in the format Case #x: M, where x is the case number (starting from 1) and M is the number of prefix free subsets.</p>