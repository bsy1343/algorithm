# [Gold I] Crime House (Small) - 12230

[문제 링크](https://www.acmicpc.net/problem/12230)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>While working for the police, you&#39;ve identified a house where people go to commit crimes, called Crime House. One day, you set up a camera over the door of the house and record a video.</p>

<p>You don&#39;t know how many people were in Crime House at the start of the day, but you can see people enter and leave through the front door. Unfortunately, because the people entering and leaving Crime House are criminals, sometimes they wear masks; and you aren&#39;t quite sure if the front door is the only way in or out.</p>

<p>Sometimes you can guess who was wearing a mask. If criminal #5 entered the house, then someone wearing a mask left, then criminal #5 entered the house again, then either the person wearing the mask was criminal #5, or there is another way out of Crime House.</p>

<p>At the end of the day, when Crime House has closed its doors for the night, you watch your video. Because you&#39;re an optimist, you want to figure out if it&#39;s <em>possible</em> that there are no other entrances or exits from crime house; and if so, you want to figure out the <em>minimum</em> number of people who could be in Crime House at the end of the day.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case starts with a line containing a single integer <strong>N</strong>, the number of times people pass through the front door of Crime House in the day. Next follows <strong>N</strong> lines, each of which contains information about one person entering or leaving Crime House through the front door.</p>

<p>That information consists of a single character, E or L, followed by a space and then an integer <strong>id</strong>. If the first character is E, that indicates someone entered Crime House through the front door; if it&#39;s L, someone left through the front door. If <strong>id</strong> is greater than zero, the person with that identifier entered or left Crime House. If <strong>id</strong> is zero, then the person who entered or left Crime House was wearing a mask, and we don&#39;t know who he or she was.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>0 &le; <strong>id</strong> &le; 2000.</li>
	<li>1 &le; <strong>N</strong> &le; 15.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1). If it&#39;s possible that there are no other entrances or exits from Crime House, then y should be the minimum number of people who could be in Crime House at the end of the day. If that&#39;s impossible, y should be &quot;CRIME TIME&quot;.</p>