# [Platinum III] Programming Tutors - 13470

[문제 링크](https://www.acmicpc.net/problem/13470)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 223, 정답: 125, 맞힌 사람: 109, 정답 비율: 58.919%

### 분류

이분 탐색, 매개 변수 탐색, 이분 매칭

### 문제 설명

<p>You are the founder of the Bruce Arden Programming&nbsp;Collective, which is a tutoring programme that matches&nbsp;experienced programmers with newbies to teach them.&nbsp;You have N students and N tutors, but now you have&nbsp;to match them up. Since the students will have to travel&nbsp;to their tutors&rsquo; houses from their own (or vice versa) you&nbsp;decide to do your matching based on travel distance.</p>

<p>Minimising overall distance doesn&rsquo;t seem fair; it might happen that one student has to travel&nbsp;a huge distance while all the other students get a tutor very close by, even though the tutors&nbsp;could have been split up so that each gets a tutor that is at least somewhat close.</p>

<p>Thus, you opt to minimise the distance travelled by the student who is worst off; one pairing&nbsp;of students to tutors is better than another if the student who has to travel farthest in the&nbsp;first pairing has to travel less far than the student who has to travel farthest in the second<br />
pairing.</p>

<p>Because the students live in a city, the distance that a student needs to travel is not the&nbsp;literal distance between them and their tutor. Instead, the distance between points (X, Y)&nbsp;and (X&#39;, Y&#39;)&nbsp;in the city is&nbsp;|X &minus; X&#39;| + |Y &minus; Y&#39;|.</p>

### 입력

<p>The first line of the input contains an integer N, with 1 &le; N &le; 100, the number of students&nbsp;and the number of tutors to pair up.</p>

<p>Then, there are N lines, each with two space separated integers with absolute value at most&nbsp;10<sup>8</sup>, which give the locations of the N students.</p>

<p>These are followed by N lines, each with two space separated integers with absolute value at&nbsp;most 10<sup>8</sup>, which give the locations of the N tutors.</p>

<p>Note that it is possible for students and/or tutors to have identical locations (they may share&nbsp;a house).</p>

### 출력

<p>Output a single line containing a single integer K, where K is the least integer such that there&nbsp;exists a pairing of students to tutors so that no pair has distance greater than K between&nbsp;them.</p>