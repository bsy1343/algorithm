# [Gold III] Zoo - 17821

[문제 링크](https://www.acmicpc.net/problem/17821)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 19, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

0-1 너비 우선 탐색, 데이크스트라, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>On a cold Christmas night in 2010, Zagreb was covered in snow. Zdravko decided to leave his castle, cross the road and take a stroll through the Maksimir park. Unfortunately, the idyllic winter evening was interrupted by a monster that was lurking in the nearby bushes. The monster jumped in front of Zdravko, but Zdravko roared a mighty roar which scared the monster away. Unbeknownst to him, a bunch of animals from the nearby zoo were startled by that roar. More precisely, a group of tigers and bulls were so annoyed that they decided to escape the zoo in order to find a nice quiet place to sleep.</p>

<p>During their escape, the animals had to pass through a rectangular area divided in R &times; C unit squares. The animals must enter the area through the upper-left corner and must leave the area through the lower-right corner. In order to escape as quietly as possible, animals will pass through this area one by one, walking along an arbitrary path in four general directions (up, down, left and right). In other words, each animal does not necessarily travel along a shortest path during its escape and it might step on the same unit square more than once (including the entrance and exit). Since the ground is covered in snow, animals leave footprints when they step inside unit squares. If another footprint is already in the square that is about to be stepped on, the animal will erase the previous footprint and leave a new one.</p>

<p>Your task is to determine the minimal number of animals that have escaped the Maksimir zoo based on the footprints that were left in the aforementioned rectangular area.</p>

### 입력

<p>The first line contains two integers R and C from the task description.</p>

<p>The next R lines contain C characters that represent the rectangular area from the task description Character T represents a tiger&rsquo;s footprint, character B represents a bull&rsquo;s footprint and character * represents untouched snow.</p>

<p>You can assume that the input data is such that at least one animal entered the rectangular area and that each animal that entered the area has also left the area according to the rules from the task description.</p>

### 출력

<p>Output the minimal number of animals that have escaped the zoo.</p>