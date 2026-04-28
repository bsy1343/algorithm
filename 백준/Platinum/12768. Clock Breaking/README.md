# [Platinum II] Clock Breaking - 12768

[문제 링크](https://www.acmicpc.net/problem/12768)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 24, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>After numerous unfortunate freak fatalities and the lawsuits, settlements, protests, and boycotts that naturally followed, the beleaguered executives at ACME Clock Manufacturers have decided they need to finally fix their disastrous quality control issues. It has been known for years that the digital clocks they manufacture have an unacceptably high ratio of faulty liquid-crystal display (LCD) screens, and yet these heartless souls have repeatedly failed to address the issue, or even warn their hapless consumers!</p>

<p>You have been called in as a quality consultant to finally put a stop to the madness. Your job is to write an automated program that can test a clock and find faults in its display.</p>

<p>These clocks use a standard 7-segment LCD display for all digits (shown on the left in Figure D.1), plus two small segments for the &lsquo;:&rsquo;, and show all times in a 24-hour format. The minute before midnight is 23:59, and midnight is 0:00. The &lsquo;:&rsquo; segments of a working clock are on at all times. The representation of each digit using the seven segments is shown on the right in Figure D.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12768.%E2%80%85Clock%E2%80%85Breaking/c8f4046d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12768.%E2%80%85Clock%E2%80%85Breaking/c8f4046d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12768/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:86px; width:460px" /></p>

<p style="text-align: center;">Figure D.1: LCD display of each digit.</p>

<p>Your program will be given the display of a clock at several consecutive minutes, although you do not know exactly what time these displays start. Some of the LCD segments are burnt out (permanently off) and some are burnt in (permanently on). Your program must determine, where possible, which segments are definitely malfunctioning and which are definitely in working order.</p>

### 입력

<p>The first input line contains a single integer n (1 &le; n &le; 100), which is the number of consecutive minutes of a clock&rsquo;s display. The next 8n &minus; 1 lines contain n ASCII images of these clock displays of size 7 &times; 21, with a single blank line separating the representations.</p>

<p>All digit segments are represented by two characters, and each colon segment is represented by one character. The character &lsquo;X&rsquo; indicates a segment that is on. The character &lsquo;.&rsquo; indicates anything else (segments that are off or non-segment portions of the display). See the sample input/output for details; the first output shows every possible LCD segment along with the smaller segments used to represent the &lsquo;:&rsquo;. No clock representation has an &lsquo;X&rsquo; in a non-segment position or only half of a segment showing.</p>

### 출력

<p>Display a 7 &times; 21 ASCII image with a &lsquo;0&rsquo; for every segment that is burnt out, a &lsquo;1&rsquo; for every segment that is burnt in, a &lsquo;W&rsquo; for every segment that is definitely working, and a &lsquo;?&rsquo; for every segment for which the status cannot be determined. Use &lsquo;.&rsquo; for non-segments. If the given displays cannot come from consecutive minutes, display <code>impossible</code>.</p>