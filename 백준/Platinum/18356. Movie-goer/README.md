# [Platinum II] Movie-goer - 18356

[문제 링크](https://www.acmicpc.net/problem/18356)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 143, 정답: 58, 맞힌 사람: 49, 정답 비율: 41.525%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Byteasar is an avid movie-goer, so he was pleased to find out that his favorite studio cinema will be running a summer movie marathon. Each of the n days of the summer, one out of m movies will be screened. A marathon pass entitles one to see any number of movies, provided that the pass holder does not skip a day, i.e., skipping one invalidates the pass. One can, however, choose their first day freely.</p>

<p>Based on Internet reviews, Byteasar has assigned each of the m movies a score. Now he would like to use his summer pass so as to maximize the total score of the movies he sees. What makes this a challenging task is the fact that Byteasar cannot stand watching the same movie again. Watching a movie again not only bores him, but also deprives him of all the fond memories previously associated with the movie. Thus, in fact he wants to maximize the total score of the movies he will see exactly once.</p>

### 입력

<p>In the first line of the standard input, there are two integers, n and m (1 &le; m &le; n &le; 1 000 000), separated by a single space, that specify the length of the summer movie marathon and the number of movies, respectively. For ease of notation, we number the movies from 1 to m.</p>

<p>In the second line, there is a sequence of n integers, f<sub>1</sub>, f<sub>2</sub>, . . . , f<sub>n</sub> (1 &le; f<sub>i</sub> &le; m), separated by single spaces: f<sub>i</sub> is the number of the movie screened on the i-th day of the marathon. In the third line, there is a sequence of m integers, w<sub>1</sub>, w<sub>2</sub>, . . . , w<sub>m</sub> (1 &le; w<sub>j</sub> &le; 1 000 000), separated by single spaces: w<sub>j</sub> is the score of the movie no. j. Note that it may happen that some of the m movies will not be screened at all during the marathon.</p>

<p>There is a set of tests worth 70% of the total score, in which n &le; 100 000 holds, and a subset of it worth 20% of the total score, in which n &le; 8000 holds.</p>

### 출력

<p>In the first and only line of the standard output, a single number should be printed, equal to the maximial total score of the movies Byteasar can watch exactly once with his summer movie marathon pass.</p>

### 힌트

<p>Byteasar can use his pass to watch 6 movies, starting on the second day of the marathon. This way, he will see the movies no. 2, 3, and 4 exactly once.</p>