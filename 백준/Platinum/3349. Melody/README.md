# [Platinum I] Melody - 3349

[문제 링크](https://www.acmicpc.net/problem/3349)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 11, 맞힌 사람: 10, 정답 비율: 32.258%

### 분류

이분 탐색, 다이나믹 프로그래밍, 플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>Linas likes to play some musical instrument, and nobody knows what it is called. The instrument has S holes and Linas is able to play N different notes (numbered from 1 to N) by covering each hole in one of 10 different ways (numbered from 0 to 9). Every note can be played by covering all holes in exactly one way, described by a sequence of digits corresponding to coverings of respective holes. If the holes are covered incorrectly (i.e., not corresponding to any note), the instrument starts to produce very unpleasant sounds, so Linas plays a wrong note rather than covers holes incorrectly.</p>

<p>Linas plays in a band where he has to play complicated tunes very quickly. Linas has written a tune (i.e., a sequence of numbers, corresponding to notes) and he wants to play it together with the band. Unfortunately, Linas doesn&rsquo;t play perfectly. He can only play two successive notes if by playing the second he has to cover no more than G holes differently than when playing the first one. Hence he decided to sometimes play a wrong note in the tune. Each incorrect note Linas plays is called mistake.</p>

<p>For a given tune find a modified tune that Linas can play making the least possible number of mistakes.</p>

### 입력

<p>First line of standard input contains three integers: number of possible notes N(1&le;N&le;100), number of holes S and fingers&rsquo; speed G(0&le;G&lt;S&le;100). Next N lines contain the list of possible notes. There are S digits without spaces in each of them. The j-th digit in the i+1-th line corresponds to covering of the j-th hole required to play the i-th note (hole can be covered in various ways, labelled by digits from 0 to 9). No two notes are played in the same way.</p>

<p>N+2-th line contains the length of the tune L(1&le;L&le;10<sup>5</sup>). The last line contains the tune: L integers separated by spaces, corresponding to the notes played successively in the tune.</p>

### 출력

<p>The first line of standard output must contain one non-negative integer &ndash; the minimum number of mistakes. The second line must contain a valid tune which obtains the minimum number of mistakes: L integers separated by spaces, corresponding to the notes that Linas should play. If there are multiple such tunes, output any of them.</p>