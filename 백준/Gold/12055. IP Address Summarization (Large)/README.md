# [Gold III] IP Address Summarization (Large) - 12055

[문제 링크](https://www.acmicpc.net/problem/12055)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 40, 맞힌 사람: 33, 정답 비율: 64.706%

### 분류

자료 구조, 트리, 트라이

### 문제 설명

<p>An IP (Internet Protocol) address is a number that is assigned to each device on the Internet. At the time being, most devices use version four of this protocol (IPv4). An IPv4 address is a 32-bit string. IPv4 addresses are normally represented in dot-decimal notation, which consists of four decimal numbers called octets, each ranging from 0 to 255 (inclusive), separated by dots, e.g., 172.16.254.1. Each octet represents a group of 8 bits (one byte) of the address. The first 8 bits of the string (when interpreted as an unsigned integer, with the most significant bit first) form the first octet, the next 8 bits form the second octet, and so on.&nbsp;</p>

<p>An IP subnet addresses is used to represent a group of devices that belong to the same network. IP subnet addresses are expressed in the format of an IP address, followed by a slash and then a prefix length ranging from 0 to 32. A subnet address stands for all IP addresses that have the same first P bits of the given address, where P is the prefix length. For example 10.8.0.0/9 represents 2<sup>23</sup>&nbsp;addresses that all have&nbsp;<code>000010100</code>&nbsp;(the first nine bits of 10.8.0.0) as their first 9 bits, that is, 10.0.0.0 through 10.127.255.255. Note that 10.8.0.0/9 and, for example, 10.0.0.0/9 (or any other address within the subnet) would be equivalent ways to refer to the same subnet, because those addresses start with the same nine bits.</p>

<p>A subnet is&nbsp;<em>normalized</em>&nbsp;if the bits of the address other than the prefix are all zeroes. For example, 10.8.1.0/24 and 10.8.1.2/24 represent the same subnet, but 10.8.1.0/24 is normalized. The normalization of 255.255.255.255/13 is 255.248.0.0/13.</p>

<p>You will be given a list of subnet addresses, and you must output the shortest ordered list of subnets such that all the addresses are normalized and an address belongs to some subnet in the input if and only if it belongs to some subnet in the output.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each begins with one line with an integer&nbsp;<strong>N</strong>, the number of subnets, and is followed by&nbsp;<strong>N</strong>&nbsp;more lines, each of which has a subnet addresses. Each subnet address is of the form&nbsp;<code>A.B.C.D/P</code>, where A, B, C, and D are integers from 0 to 255, inclusive, and P is an integer from 0 to 32, inclusive. No integer (apart from 0) has leading zeroes.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&quot;, where x is the test case number (starting from 1). Then output a list of subnet addresses, one per line, meeting the conditions described above. These addresses must be normalized and must be ordered. An address X comes before another address Y if X&#39;s first integer is smaller than Y&#39;s first integer, or if X and Y have the same first integer but X&#39;s second integer is smaller than Y&#39;s second integer, and so on.</p>

<p>Note that the requirements of the problem guarantee that there is a single unique answer for each test case.</p>