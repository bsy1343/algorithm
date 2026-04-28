# [Gold IV] Alias - 21222

[문제 링크](https://www.acmicpc.net/problem/21222)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 63, 맞힌 사람: 57, 정답 비율: 70.370%

### 분류

자료 구조, 데이크스트라, 그래프 이론, 해시를 사용한 집합과 맵, 최단 경로, 집합과 맵

### 문제 설명

<p>Novak and Rafael are playing a simplified version of the game Alias. Novak needs to make Rafael guess a word without saying it. Rafael has a database of n words in his head, and there are m connections between some words. The connection between words x and y, with time t, means that if Rafael remembers the word x or hears it, after t milliseconds he will remember the word y.</p>

<p>Novak and Rafael will play q rounds. In each round, Novak wants to know: if he says the word a, after how many milliseconds will Rafael remember the word b for the first time? The rounds are independent.</p>

### 입력

<p>The first line contains integers n (2 &le; n &le; 1000) and m (1 &le; m &le; 1000), the number of words and the number of connections.</p>

<p>Each of the following m lines contains two different words x<sub>i</sub> and y<sub>i</sub>, and an integer t<sub>i</sub> (1 &le; t<sub>i</sub> &le; 10<sup>9</sup>), that describe a connection. The words consist of at most 20 lowercase letters. All words from Rafael&rsquo;s database will appear at least once. It is possible that there are multiple connections between some pairs of words.</p>

<p>The following line contains an integer q (1 &le; q &le; 1000), the number of rounds.</p>

<p>Each of the following q lines contains two different words ai and bi , the word that Novak will say and the word that Rafael needs to remember in the i-th round. Both words appear in Rafael&rsquo;s database.</p>

### 출력

<p>Output q lines. In the i-th line output the time for the i-th round in milliseconds, or <code>Roger</code> if Rafael will never remember the word.</p>