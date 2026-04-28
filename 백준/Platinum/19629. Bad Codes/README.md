# [Platinum II] Bad Codes - 19629

[문제 링크](https://www.acmicpc.net/problem/19629)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 25, 맞힌 사람: 22, 정답 비율: 55.000%

### 분류

그래프 이론, 문자열, 최단 경로, 데이크스트라

### 문제 설명

<p>Your friend has constructed a code that they want to use to send secret messages to you. The messages will only be composed of N different symbols and each symbol will correspond to one binary sequence with at most M bits.</p>

<p>However, you are not sure the code is going to work: there is a chance that a binary sequence can correspond to two (or more) different messages.</p>

<p>For example, if the code was:</p>

<p style="text-align: center;">A &rarr; 101 B &rarr; 10 C &rarr; 1 D &rarr; 100</p>

<p>then the binary sequence 101 could be correspond to either A or BC.</p>

<p>Your job is determine the length of the shortest binary sequence that corresponds to two different messages, or determine that there are no binary sequences which correspond to two different messages.</p>

### 입력

<p>The first line of input will contain two space-separated integers N and M (1 &le; N, M &le; 50). The next N lines of input each will have at least one and at most M characters from the set {0, 1}.</p>

### 출력

<p>Output will be one line long.</p>

<p>If there is a binary sequence that corresponds to two (or more) messages, print the length of the shortest such binary sequence; otherwise, output one line containing -1.</p>