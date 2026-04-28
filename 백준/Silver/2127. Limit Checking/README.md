# [Silver IV] Limit Checking - 2127

[문제 링크](https://www.acmicpc.net/problem/2127)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 32, 맞힌 사람: 21, 정답 비율: 60.000%

### 분류

구현, 자료 구조, 문자열, 시뮬레이션, 집합과 맵, 많은 조건 분기, 해시를 사용한 집합과 맵, 파싱

### 문제 설명

<p>From time to time, customers of the First Goldfields Bank of Pembroke make dramatic errors with their banking transactions. For example, they might add an extra zero and transfer \$10,000 to someone else when they only intended to transfer \$1,000. The bank theorises that this is related to the large sums of money and large drinking budgets associated with a successful goldfield, and plans to introduce transaction limits to detect and prevent serious errors.</p>

<p>Each transaction is a request to transfer an amount of money from one account to another. There are two different kinds of transactions: if the transfer is between two accounts owned by the same customer, then it is an inter-account transfer (IAT); otherwise, when transferring money to someone else&rsquo;s account, the transaction is known as a payment.</p>

<p>The bank has invited each customer to specify a maximum instruction limit and a daily exposure limit for each kind of transaction, with the expectation that most customers will want to set higher limits for inter-account transfers than for general payments.</p>

<p>These limits are applied as follows:</p>

<ul>
	<li>A transaction will fail if its value exceeds the applicable maximum instruction limit.</li>
	<li>A transaction will fail if the applicable daily exposure limit is exceeded when its value is added to the total value of the customer&rsquo;s previously successful transactions of the same kind that day. (But later transactions might succeed if they are for smaller amounts.)</li>
</ul>

<p>Your task is to write the program to enforce these limits.</p>

### 입력

<p>Each line of the input file is a banking record, consisting of a number of fields separated by commas (&lsquo;,&rsquo;). There are four types of banking record, distinguished by the first field:</p>

<ul>
	<li>&#39;1&rsquo; records are customer records, which have six fields. The second field is the customer name, consisting of exactly eight uppercase letters. The remaining fields are amounts; from left to right they are the customer&rsquo;s IAT maximum instruction limit, IAT daily exposure limit, general payment maximum instruction limit, and general payment daily exposure limit.</li>
	<li>&lsquo;2&rsquo; records are account records, which have three fields. The third field is the account number, consisting of exactly six digits (&lsquo;0&rsquo; to &lsquo;9&rsquo;). These records specify that the account is owned by the customer named by the second field.</li>
	<li>&lsquo;5&rsquo; records are instruction records and have a total of six fields, representing a transaction. The second through sixth fields are: the date of the transaction, in the format YYYYMMDDhhmmss; the customer making the transaction; the source account (from which the money is to come); the amount; and the destination account.</li>
	<li>The &lsquo;9&rsquo; record terminates the input file, and has just one field.</li>
</ul>

<p>All amounts in the input data are dollars and cents values written with a decimal point (&lsquo;.&rsquo;) and two cents digits (but no commas), with a maximum value of \$9,999,999.99. All &lsquo;1&rsquo; records appear before all &lsquo;2&rsquo; records, which appear before all &lsquo;5&rsquo; records, which appear before the &lsquo;9&rsquo; record.</p>

<p>All customer names appearing in &lsquo;2&rsquo; or &lsquo;5&rsquo; records will be valid customers who have been listed in exactly one &lsquo;1&rsquo; record, and all account numbers appearing in &lsquo;5&rsquo; records will be valid accounts which have been listed in exactly one &lsquo;2&rsquo; record. Furthermore, the &lsquo;5&rsquo; records will appear in increasing datestamp order. There will be no more than 50 customers and 200 accounts.</p>

<p>The bank does not accept transactions between 23:00 and 06:00, believing that customers will be more than usually impaired during these periods&mdash;especially at weekends. Hence such times do not appear in the input file.</p>

### 출력

<p>Output must contain one line for each input &lsquo;5&rsquo; record, starting with &lsquo;INSTRUCTION n: &rsquo;, where n is the instruction number (starting from 1), followed by one of the following messages, as appropriate:</p>

<p>&lsquo;NOT OWNER&rsquo; if the source account is not owned by the customer;<br />
&lsquo;IAT MAX EXCEEDED&rsquo; or &lsquo;PAYMENT MAX EXCEEDED&rsquo; if the transaction amount exceeds the applicable maximum instruction limit;<br />
&lsquo;IAT DEL EXCEEDED&rsquo; or &lsquo;PAYMENT DEL EXCEEDED&rsquo; if the transaction amount would cause the applicable daily exposure limit to be exceeded;<br />
or &lsquo;IAT OK&rsquo; or &lsquo;PAYMENT OK&rsquo; if the transaction is successful.</p>

<p>If a transaction fails both limit tests, output only the &lsquo;. . . MAX EXCEEDED&rsquo; message.</p>