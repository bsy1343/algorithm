# [Gold IV] Rock Band - 13351

[문제 링크](https://www.acmicpc.net/problem/13351)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 58, 맞힌 사람: 56, 정답 비율: 72.727%

### 분류

자료 구조, 정렬, 누적 합, 해시를 사용한 집합과 맵, 스위핑, 두 포인터

### 문제 설명

<p>Every day after school, you and your friends get together and play in a band. Over the past&nbsp;couple of months, the band has been rehearsing a large number of songs. Now it&rsquo;s time to&nbsp;go out and perform in front of a crowd for the first time. In order to do so, a set list for the&nbsp;concert needs to be determined.</p>

<p>As it turns out, every band member has a different taste in music. (Who would have thought?)&nbsp;Everybody is very picky: a band member doesn&rsquo;t want to play any particular song X unless&nbsp;he also gets to play all songs he likes better than song X. This holds for every band member&nbsp;and for every song X. Furthermore, obviously at least one song should be performed.</p>

<p>The organisers of the concert do not want you to play too many songs, so a selection needs&nbsp;to be made that is as small as possible. As the unofficial leader of the band, you have taken&nbsp;it upon yourself to find a minimum length set list that meets the requirements.</p>

### 입력

<p>The first line contains two integers M and S, satisfying M &ge; 1 and S &ge; 1 as well as&nbsp;M &times; S &le; 10<sup>6</sup>. These denote the total number of band members and the number of songs,&nbsp;respectively.</p>

<p>The following M lines each contain S integers per line, where the i-th line denotes the preference&nbsp;list of the i-th band member, starting with his favourite song and ending with his least&nbsp;favourite song. The songs are numbered 1 through S.</p>

<p>No two band members have the exact same preference lists.</p>

### 출력

<p>Output the smallest possible set list, using the following format:</p>

<ul>
	<li>One line with an integer L: the length of the smallest possible set list.</li>
	<li>One line with L space-separated integers, denoting a sorted list of the songs to be played.</li>
</ul>