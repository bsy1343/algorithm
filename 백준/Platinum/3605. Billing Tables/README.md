# [Platinum II] Billing Tables - 3605

[문제 링크](https://www.acmicpc.net/problem/3605)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 4, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

자료 구조, 트리, 트라이

### 문제 설명

<p>In the world of telecommunications phone calls to different phone numbers have to be charged using different rate or different billing plan. International Carrier of Phone Communications (ICPC) has an antique billing table that determines which phone call has to be charged using which billing plan.</p>

<p>Each international phone number has 11 digits. The billing table has n lines. Each line specifies a range of prefixes of phone numbers like &ldquo;7919 - 921&rdquo;. This specification means that all phone numbers starting from 7919, 7920, and 7921 match this line. A billing plan name is specified for each prefix. To determine a billing plan for a call, the table is scanned from top to bottom and the first matching line determines the billing plan. If no match is found, the phone number is invalid and no billing plan is needed. A special billing plan named &ldquo;invalid&rdquo; (without quotes) is used as an alternative way to define invalid phone numbers. Some billing plans are used for quite differently looking phone numbers and their names may be specified on different lines in different places of the table.</p>

<p>ICPC&rsquo;s billing table is old and contains many entries. Some of those entries may not be even used anymore. It is very hard to figure out which phone numbers each billing plan is actually used for. The ICPC&rsquo;s management has reached a decision to transform this billing table into a more legible format. In this new format table consists of the lexicographically ordered list of simple prefixes (without the &ldquo;-&rdquo; range feature of the old format) with a billing plan name for each prefix. No prefix of this new billing table should be a prefix of any other prefix from the table. Thus, a simple dictionary lookup (binary search, for example) will be sufficient to figure out a billing plan for a given phone number. Finding all phone numbers for a given billing plan will also become quite a simple task. The number of lines in the new billing table should be minimized. Billing plan named &ldquo;invalid&rdquo; should not be present in the new billing table at all, since invalid phone numbers will be denoted by absence of the corresponding prefix in the new billing table.</p>

### 입력

<p>The first line of the input file contains a single integer number n (1 &le; n &le; 100) &mdash; the number of lines in the old billing table. The following n lines describe the old billing table with one rule on a line. Each rule contains four tokens separated by spaces &mdash; prefix A, minus sign (&ldquo;-&rdquo;), prefix B, and billing plan name. Prefixes contain from 1 to 11 digits each, and the billing plan name contains from 1 to 20 lower case letters.</p>

<p>Further, let us denote with |A| the number of digits in the prefix A. It is true that 1 &le; |B| &le; |A| &le; 11. Moreover, last |B| digits of prefix A form a string that is lexicographically equal or precedes B.</p>

<p>Such pair of prefixes A and B matches all phone numbers with the first |A| &minus; |B| digits matching the first digits of A and with the following |B| digits being lexicographically between the last |B| digits of A and B (inclusive).</p>

### 출력

<p>Write to the output file a single integer number k &mdash; the minimal number of lines that the new table should contain to describe the given old billing table. Then write k lines with the lexicographically ordered new billing table. Write two tokens separated by a space on each line &mdash; the prefix and the billing plan name. Note, that the prefix in the new billing table shall contain at least one digit.</p>

<p>If all phone numbers are invalid (every phone number has no matching line or matches line with billing plan &ldquo;invalid&rdquo;) then the output file should contain just number zero.</p>