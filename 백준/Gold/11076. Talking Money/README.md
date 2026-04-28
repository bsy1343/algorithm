# [Gold III] Talking Money - 11076

[문제 링크](https://www.acmicpc.net/problem/11076)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 65, 정답: 16, 맞힌 사람: 16, 정답 비율: 29.630%

### 분류

많은 조건 분기, 구현, 문자열

### 문제 설명

<p>The company you work for, Automatic Conversation Machina, a text to speech service provider, has just won a contract for a telephone banking system. Unfortunately their text to speech software does not yet work with numerical values like the balance in a bank account. They need you to take a currency value and convert that to words so the software will be fully functional for the telephone banking system.</p>

<p>The conversion must work for values between negative <code>$999 999 999 999.99</code> and positive <code>$999 999 999 999.99</code>. None of the bank&rsquo;s customers are trillionaires just yet.</p>

<p>The value must be fully converted to words for all parts of the currency amount including the cents amount i.e. <code>zero dollars</code> and <code>zero cents</code> are to be included if the dollar or cents value are zero, respectively. The following rules must be observed:</p>

<ul>
	<li>If there is no billions, millions, thousands or units group in the value these groups must not be converted.</li>
	<li>All non-multiples of ten between 21 and 99 inclusive must separate the tens word from the units word with a single hyphen e.g. &lsquo;<code>twenty-one</code>&rsquo; and &lsquo;<code>ninety-nine</code>&rsquo;.</li>
	<li>The word &lsquo;<code>and</code>&rsquo; must appear after the word &lsquo;<code>hundred</code>&rsquo; in all cases except when the value being converted is a round hundred e.g. compare &lsquo;<code>one hundred thousand</code>&rsquo; with &lsquo;<code>one hundred and twenty-three thousand</code>&rsquo;.</li>
	<li>The word &lsquo;<code>and</code>&rsquo; must appear between the least of the billions, millions or thousands groups and the units group if the units group is less than one hundred except when the units group equals <code>0</code> e.g. compare &lsquo;<code>two thousand and forty-six</code>&rsquo; with &lsquo;<code>two thousand five hundred and fifty-seven</code>&rsquo;.</li>
	<li>The word &lsquo;<code>dollars</code>&rsquo; must appear after the dollar amount except if the dollar amount is <code>1</code> in which case the word &lsquo;<code>dollar</code>&rsquo; must appear.</li>
	<li>The word &lsquo;<code>and</code>&rsquo; must appear between the dollars amount and the cents amount.</li>
	<li>The word &lsquo;<code>cents</code>&rsquo; must appear after the cents amount except if the cents amount is <code>1</code> in which case the word &lsquo;cent&rsquo; must appear.</li>
	<li>If the value is negative, the words &lsquo;<code>in debit</code>&rsquo; must be added to the end of the amount.</li>
	<li>If the value is positive, the words &lsquo;<code>in credit</code>&rsquo; must be added to the end of the amount.</li>
	<li>If the value is zero, the words &lsquo;<code>in debit</code>&rsquo; or &lsquo;<code>in credit</code>&rsquo; must not be included.</li>
</ul>

<p>The correct spelling for all values likely to be needed are: <code>zero</code>, <code>one</code>, <code>two</code>, <code>three</code>, <code>four</code>, <code>five</code>, <code>six</code>, <code>seven</code>, <code>eight</code>, <code>nine</code>, <code>ten</code>, <code>eleven</code>, <code>twelve</code>, <code>thirteen</code>, <code>fourteen</code>, <code>fifteen</code>, <code>sixteen</code>, <code>seventeen</code>, <code>eighteen</code>, <code>nineteen</code>, <code>twenty</code>, <code>thirty</code>, <code>forty</code>, <code>fifty</code>, <code>sixty</code>, <code>seventy</code>, <code>eighty</code>, <code>ninety</code>, <code>hundred</code>, <code>thousand</code>, <code>million</code>, <code>billion</code>.</p>

### 입력

<p>The input contains a single test case.</p>

<p>The input will consist of one currency value v (&minus;\$999 999 999 999.99 &le; v &le; \$999 999 999 999.99).</p>

### 출력

<p>The output for the test case must be on a single line with a single space between each word. Note: The sample output is displayed over multiple lines so that it fits on the page.</p>