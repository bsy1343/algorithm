# [Platinum I] Index - 21225

[문제 링크](https://www.acmicpc.net/problem/21225)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 512 MB

### 통계

제출: 218, 정답: 100, 맞힌 사람: 76, 정답 비율: 58.915%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 퍼시스턴트 세그먼트 트리, 병렬 이분 탐색

### 문제 설명

<p>The <em>h-index</em> is an author-level metric that measures both the productivity and citation impact of the publications of a scientist or scholar. It is defined as the maximum value of h such that the given author has published h papers that have each been cited at least h times.</p>

<p>Our Mirko is nearing retirement. In his life he had published n papers and now q times he asks himself the following: &ldquo;I wonder, what would be my h-index had I only published papers l<sub>i</sub> through r<sub>i</sub>?&rdquo;</p>

<p>Help him calculate the answers.</p>

### 입력

<p>The first line contains integers n and q (1 &le; n, q &le; 200 000), the number of papers and the number of questions.</p>

<p>The second line contains n integers p<sub>i</sub> (1 &le; p<sub>i</sub> &le; 200 000), where p<sub>i</sub> is the number of citations of the i-th paper.</p>

<p>The following q lines each contain two integers l<sub>i</sub> and r<sub>i</sub> (1 &le; l<sub>i</sub> &le; r<sub>i</sub> &le; n), the endpoints from the i-th question.</p>

### 출력

<p>Output q lines. In the i-th line output the answer to the i-th question.</p>