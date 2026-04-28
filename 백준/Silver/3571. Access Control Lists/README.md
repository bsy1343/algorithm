# [Silver III] Access Control Lists - 3571

[문제 링크](https://www.acmicpc.net/problem/3571)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 8, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Nick is developing a new web server. The feature he is working on now is support for access control lists. Access control list allows to restrict access to some resources on the web site based on the IP address of the requesting party.</p>

<p>Each IP address is a 4-byte number that is written byte-by-byte in a decimal dot-separated notation &ldquo;byte0.byte1.byte2.byte3&rdquo; (quotes are added for clarity). Each byte is written as a decimal number from 0 to 255 (inclusive) without extra leading zeroes. IP addresses are organized into IP networks.</p>

<p>IP network is described by two 4-byte numbers &mdash; network address and network mask. Both network address and network mask are written in the same notation as IP addresses.</p>

<p>In order to understand the meaning of network address and network mask you have to consider their binary representation. Binary representation of IP address, network address, and network mask consists of 32 bits: 8 bits for byte0 (most significant to least significant), followed by 8 bits for byte1, followed by 8 bits for byte2, and followed by 8 bits for byte3.</p>

<p>IP network contains a range of 2n IP addresses where 0 &le; n &le; 32. Network mask always has 32 &minus; n first bits set to one, and n last bits set to zero in its binary representation. Network address has arbitrary 32 &minus; n first bits, and n last bits set to zero in its binary representation. IP network contains all IP addresses whose 32 &minus; n first bits are equal to 32 &minus; n first bits of network address with arbitrary n last bits.</p>

<p>For example, IP network with network address 194.85.160.176 and network mask 255.255.255.248 contains 8 IP addresses from 194.85.160.176 to 194.85.160.183 (inclusive).</p>

<p>IP networks are usually denoted as &ldquo;byte0.byte1.byte2.byte3/s&rdquo; where &ldquo;byte0.byte1.byte2.byte3&rdquo; is the network address and s is the number of bits set to one in the network mask. For example, the IP network from the previous paragraph is denoted as 194.85.160.176/29.</p>

<p>Access control list contains an ordered list of rules. Each rule has one of the following forms:</p>

<ul>
	<li>&ldquo;<code>deny from &lt;IP network&gt;</code>&rdquo; &mdash; denies access to the resource to any IP from the specified IP net- work.</li>
	<li>&ldquo;<code>deny from &lt;IP address&gt;</code>&rdquo; &mdash; denies access to the resource to the specified IP address.</li>
	<li>&ldquo;<code>allow from &lt;IP network&gt;</code>&rdquo; &mdash; allows access to the resource to any IP from the specified IP</li>
	<li>network.</li>
	<li>&ldquo;<code>allow from &lt;IP address&gt;</code>&rdquo; &mdash; allows access to the resource to the specified IP address.</li>
</ul>

<p>When some party requests some resource its IP address is first checked against its access control list. The rules are scanned in order they are listed, and the first matching rule is applied. If none of the rules matches the IP address of the party, access is granted.</p>

<p>Given access control list and the list of requesting IP addresses, find out for each request whether it will be granted access to the resource.</p>

### 입력

<p>The first line of the input file contains n &mdash; the number of rules in the access control list (0 &le; n &le; 100000). The following n lines contain rules, one per line. IP network is always specified as &ldquo;byte0.byte1.byte2.byte3/s&rdquo;.</p>

<p>The next line contains m &mdash; the number of IP addresses to check (1 &le; m &le; 100 000). The following m lines contain IP addresses to check, one per line.</p>

### 출력

<p>For each request output &lsquo;A&rsquo; if it will be granted access to the resource, or &lsquo;D&rsquo; if it will not be granted access. Output all answers in one line, do not separate output by spaces.</p>