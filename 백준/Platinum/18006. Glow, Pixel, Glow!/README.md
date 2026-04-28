# [Platinum II] Glow, Pixel, Glow! - 18006

[문제 링크](https://www.acmicpc.net/problem/18006)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 22, 맞힌 사람: 22, 정답 비율: 84.615%

### 분류

이분 탐색, 정렬, 스위핑

### 문제 설명

<p>An LCD panel is composed of a grid of pixels, spaced 1 ALU (Arbitrary Length Unit) apart both horizontally and vertically. Wires run along each row and each column, intersecting at the pixels. Wires are numbered beginning with 1 and proceeding up to a panel-dependent maximum. The vertical wire numbered 1 lies along the left edge of the panel, and the horizontal wire numbered 1 lies along the bottom edge of the panel.</p>

<p>For a period of time, pulses of current will be sent down selected wires. The current flows down the wires at a speed of one ALU per ATU (Arbitrary Time Unit). The pulses themselves have a length measured in ATUs. A pixel will activate, and glow, when current is passing through both intersecting wires at the same time. It will deactivate when either current is no longer present. If the leading edge of a pulse on one wire reaches the intersection at the exact same time that the trailing edge of a pulse on the other wire leaves that intersection, the pixel is not activated.</p>

<p>All pulses in vertical wires start from the bottom of the grid. All pulses in horizontal wires start from the left of the grid. At most one pulse will travel along any one wire.</p>

<p>Given the schedule of pulses to be sent through the wires, determine how many pixels will have been activated by the time all pulses have exited the top and right of the grid.</p>

### 입력

<p>The first line of input contains a single integer <em>n</em> (1 &le; <em>n</em> &le; 2 ∙ 10<sup>5</sup>), which is the number of current pulses.</p>

<p>Each of the next <em>n</em> lines consists of four space-separated parameters, describing a pulse:</p>

<ul>
	<li><em>d</em> character (<em>d</em> = &rsquo;h&rsquo;, or <em>d</em> = &rsquo;v&rsquo;)</li>
	<li><em>t</em> integer (1 &le; <em>t</em> &le; 2 ∙ 10<sup>5</sup>)</li>
	<li><em>m</em> integer (1 &le; <em>m</em> &le; 10<sup>5</sup>)</li>
	<li><em>a</em> integer (1 &le; <em>a</em> &le; 2 ∙ 10<sup>5</sup>)</li>
</ul>

<p>where <em>d</em> indicates whether the pulse is horizontal (&lsquo;h&rsquo;) or vertical (&lsquo;v&rsquo;), <em>t</em> is the time at which it starts (i.e., when a horizontal [vertical] pulse crosses vertical [horizontal] wire #1), <em>m</em> is its length, and <em>a</em> is the wire (horizontal or vertical) along which the pulse will travel.</p>

### 출력

<p>Output a single integer, which is the number of pixels that will have activated by the time the last pulse of current has left the grid.</p>