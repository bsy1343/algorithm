# [Platinum III] Business Cards - 7883

[문제 링크](https://www.acmicpc.net/problem/7883)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 8, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

수학, 애드 혹, 정수론, 중국인의 나머지 정리, 확장 유클리드 호제법

### 문제 설명

<p>Running a paper shop is not an easy job, especially with harsh customers. Today they brought their own rectangular sheets of paper, asking you to cut it into rectangular business cards of specific size. Moreover, they require that all the paper (which may not be cheap, but is definitely not that expensive!) has to be used, i.e. no tiny bit may be left over. Moreover, the brilliant idea of cutting the sheet into very small pieces, and then gluing them together in desired sheets was laughed at.</p>

<p>An example of a 9 &times; 6 paper sheet divided into 2 &times; 3 cards is given below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0a12beac-e812-4ebf-a106-db53349d010b/-/preview/" style="width: 159px; height: 112px;" /></p>

### 입력

<p>The input contains several test cases. The first line contains the number of test cases t (t &le; 10<sup>5</sup>). Then t test cases follow. Each of them consists of one line containing four integers a, b, c, d (1 &le; a, b, c, d &le; 10<sup>9</sup>). Numbers a and b are dimensions of each business card; c and d are dimensions of the paper sheet.</p>

### 출력

<p>For each test case output one line containing word <code>YES</code> if it is possible to divide the whole sheet into business cards, and <code>NO</code> otherwise.</p>