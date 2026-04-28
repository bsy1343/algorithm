# [Platinum I] Super Piano - 17328

[문제 링크](https://www.acmicpc.net/problem/17328)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 26, 맞힌 사람: 20, 정답 비율: 30.769%

### 분류

자료 구조, 우선순위 큐, 퍼시스턴트 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>Little Z is a minorly famous pianist. Recently, Doctor C has gifted him with a super piano. With it, little Z hopes to create the world&#39;s most enchanting music.</p>

<p>The super piano can produce&nbsp;<var>n</var>&nbsp;different notes, numbered from 1 to&nbsp;<var>n</var>. The&nbsp;<b>loveliness</b>&nbsp;of the&nbsp;<var>i</var>-th note is&nbsp;<var>A<sub>i</sub></var>, where&nbsp;<var>A<sub>i</sub></var>&nbsp;can be positive or negative.</p>

<p>A &quot;super chord&quot; consists of some number of&nbsp;<b>numerically consecutive</b>&nbsp;notes, where the chord does not contain fewer than&nbsp;<var>L</var>&nbsp;notes, nor more than&nbsp;<var>R</var>&nbsp;notes.</p>

<p>We define the&nbsp;<b>loveliness</b>&nbsp;of a chord as the sum of the lovelinesses of all the notes it contains. Two super chords are considered the same if and only if both their sets of notes are identical.</p>

<p>Little Z decides to compose a piece consisting of&nbsp;<var>k</var>&nbsp;super chords. To make the piece more extraordinary, little Z requires the piece to also consist of&nbsp;<var>k</var>&nbsp;<b>different</b>&nbsp;super chords. We define the loveliness of a piece as the sum of the lovelinesses of all its super chords. Little Z would like to know just how lovely the loveliest possible piece can be.</p>

### 입력

<p>The first line contains four positive integers&nbsp;<var>n</var>,&nbsp;<var>k</var>,&nbsp;<var>L</var>, and&nbsp;<var>R</var>.&nbsp;<var>n</var>&nbsp;represents the number of notes on the super piano.&nbsp;<var>k</var>&nbsp;represents the number of super chords that the piece should consist of.&nbsp;<var>L</var>&nbsp;and&nbsp;<var>R</var>&nbsp;respectively represent the minimum and maximum number of notes that can be in a single super chord.</p>

### 출력

<p>The output consists of a single integer, the maximum possible loveliness of a piece that little Z can compose.</p>

### 제한

<ul>
	<li>1 &le; N, k &le; 500000</li>
	<li>&minus;1000 &le;&nbsp;<var>A<sub>i</sub></var>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<var>L</var>&nbsp;&le;&nbsp;<var>R</var>&nbsp;&le;&nbsp;<var>n</var>.</li>
</ul>

<p>It is guaranteed that a composition fitting the requirements will exist.</p>