# [Gold II] Cipele - 16241

[문제 링크](https://www.acmicpc.net/problem/16241)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 65, 정답: 47, 맞힌 사람: 42, 정답 비율: 76.364%

### 분류

이분 탐색, 그리디 알고리즘, 두 포인터

### 문제 설명

<p>After spending most of his money on various projects, Nadan decided to afford high quality shoes for his software developers. Luckily for Nadan, he found N left shoes and M right shoes in his basement. Since their origin is unknown, the shoes come in various sizes.</p>

<p>Nadan asked you to pair as many shoes as possible (it&rsquo;s important that a new pair cannot be selected after pairing all the shoes). Each pair should consist of one left shoe and one right shoe. While pairing the shoes, you should make sure that the ugliness is minimized. The ugliness of one pairing is defined as the maximal absolute difference of the shoe sizes between all pairs of shoes.</p>

### 입력

<p>The first line contains two positive integers N and M (1 &le; N, M &le; 100 000), the number of left shoes and right shoes, in that order.</p>

<p>The second line contains N numbers L<sub>i</sub> (1 &le; L<sub>i</sub> &le; 10<sup>9</sup>), the sizes of the left shoes.</p>

<p>The third line contains M numbers R<sub>i</sub> (1 &le; R<sub>i</sub> &le; 10<sup>9</sup>), the sizes of the right shoes.</p>

### 출력

<p>Output the minimal ugliness between all possible shoe pairings.</p>