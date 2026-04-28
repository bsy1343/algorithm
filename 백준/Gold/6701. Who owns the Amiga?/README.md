# [Gold II] Who owns the Amiga? - 6701

[문제 링크](https://www.acmicpc.net/problem/6701)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

구현, 브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>In a corridor in a student dormitory, there are five rooms numbered <strong>1, 2, 3, 4</strong> and <strong>5</strong>; room number <strong>1</strong> is the left-most room. The rooms have doors in different colours: <strong>blue, green, red, white</strong> and <strong>yellow</strong>, but not necessarily in that order.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6701.%E2%80%85Who%E2%80%85owns%E2%80%85the%E2%80%85Amiga%3F/e6d22b3e.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6701/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.36.07.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:409px" /></p>

<p>In these rooms live five students <strong>Anna, Bernhard, Chris, David</strong> and <strong>Ellen</strong> of five different nationalities <strong>Danish, Finnish, Icelandic, Norwegian</strong> and <strong>Swedish</strong>. (Both the names and the nationalities are given in alphabetical order, so it does not follow automatically that Anna is Danish.)</p>

<p>These students have one computer each, and these computers are of different kinds: <strong>Amiga, Atari, Linux, Mac</strong> and <strong>Windows</strong> (given here in alphabetical order). They each have their own favourite programming language: <strong>C, C++, Java, Pascal</strong> and <strong>Perl</strong> (also listed in alphabetical order).</p>

<p>You want to find out who owns the Amiga computer based on some facts about the students.</p>

### 입력

<p>The input consists of several scenarios. The first input line contains a number 1&ndash;1000 indicating how many scenarios there are.</p>

<p>Each scenario starts with a line with a number 1&ndash;2000 telling how many fact lines there are for that scenario. Then follow the fact lines which each contains three words separated by one or more spaces:</p>

<ul>
	<li>The first and third word is one of these names:</li>
</ul>

<p style="margin-left:80px"><strong>12345<br />
blue green red white yellow anna bernhard chris david ellen<br />
danish finnish icelandic norwegian swedish&nbsp;<br />
amiga atari linux mac windows<br />
c c++ java pascal perl</strong></p>

<p style="margin-left:40px">(Note that no uppercase letters are used.)</p>

<ul>
	<li>The second word specifies a relationship; it is one of</li>
</ul>

<p style="margin-left:80px"><strong>same-as left-of right-of next-to</strong></p>

<p style="margin-left:40px"><strong>same-as</strong> tells that the first and third fact words apply to the same<br />
room; for instance</p>

<p style="margin-left:120px">blue same-as bernhard</p>

<p style="margin-left:80px">tells that Bernhard lives in the room with a blue door.</p>

<p style="margin-left:40px"><strong>left-of</strong> tells that the first fact word applies to the room immediately to the left of the one to which the third fact word applies. For example,</p>

<p style="margin-left:120px">chris left-of perl</p>

<p style="margin-left:80px">means that Chris lives in the room immediately to the left of the Perl programmer.</p>

<p style="margin-left:40px"><strong>right-of</strong> tells that the first fact word applies to the room immediately to the right of the one to which the third fact word applies.</p>

<p style="margin-left:40px"><strong>next-to</strong> tells that the two fact words apply to rooms next to each other. For example,</p>

<p style="margin-left:120px">swedish next-to linux</p>

<p style="margin-left:80px">means that the Swedish student lives in the next room (either to the left or the right) of the owner of the Linux computer.</p>

<p>You may assume that there are no inconsistencies in the input data. In other words, there will in every scenario be at least one person who may own the Amiga without violating the constraints.</p>

### 출력

<p>For each scenario, you should print a line starting with</p>

<p style="margin-left:40px">scenario #n:</p>

<p>where n is the scenario number. If you can determine who (i.e., Anna, Bernhard, Chris, David or Ellen) owns the Amiga, you continue the line with</p>

<p style="margin-left:40px">xxxx owns the amiga.</p>

<p>or, if you cannot name the Amiga owner, you print</p>

<p style="margin-left:40px">cannot identify the amiga owner.</p>