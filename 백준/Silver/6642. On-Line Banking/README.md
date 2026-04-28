# [Silver V] On-Line Banking - 6642

[문제 링크](https://www.acmicpc.net/problem/6642)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 138, 정답: 46, 맞힌 사람: 41, 정답 비율: 32.800%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A central bank is an institution that is responsible for the monetary policy of a country. Beside others, it monitors and supervises other banks. Your task is to write a computer program that will serve as a simple supervision instrument for monitoring bank accounts.</p>

### 입력

<p>The input contains several scenarios. Each scenario begins with a line containing a single positive integer A, the number of bank accounts at the beginning of the supervision, 0 &lt; A &le; 100. Then there are A lines each describing one account. Such a line contains the account number, one space, and a non-negative decimal number specifying the account balance.</p>

<p>Each of the following lines specifies a request for one bank operation. The line begins with a command and then, separated by a space, there are optional parameters. The list of commands follows, the third column in the table shows the number of parameters.</p>

<p>The number of requests in every scenario will always be between 0 and 1000 (inclusive). The last request of a scenario is followed by the word &ldquo;end&rdquo; and one empty line. Then the next scenario begins. The last scenario is followed by a line containing zero in place of A.</p>

<p>All account numbers consist of exactly four decimal digits followed by a slash character (&ldquo;/&rdquo;) and one digit specifying a code of the bank that operates the account. Each bank has its own unique code.</p>

<p>Amounts are always given as non-negative decimal numbers with exactly two digits after the decimal point. No amount in the input will be higher than 10 000. No unnecessary leading zeros are permitted, i.e., only amounts strictly less than 1.00 may start with a zero.</p>

<table class="table">
	<thead>
		<tr>
			<th>Command</th>
			<th>Meaning</th>
			<th>Pars</th>
			<th>Parameters Description</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>create</td>
			<td>Create a new account</td>
			<td>1</td>
			<td>New account number</td>
		</tr>
		<tr>
			<td>deposit</td>
			<td>Deposit cash to some account</td>
			<td>2</td>
			<td>Account number, Amount to deposit</td>
		</tr>
		<tr>
			<td>withdraw</td>
			<td>Withdraw cash from an account</td>
			<td>2</td>
			<td>Account number, Amount to withdraw</td>
		</tr>
		<tr>
			<td>transfer</td>
			<td>Wire transfer of money</td>
			<td>3</td>
			<td>Source account, Target account, Amount</td>
		</tr>
	</tbody>
</table>

### 출력

<p>For each request, output exactly one line. The line must begin with the command followed by the amount parameter (if present) separated from the command by a space. Then there is a colon (&ldquo;:&rdquo;), one space and the result of the operation.</p>

<p>create: If there is already an account with the same number in the same bank, the result will be &ldquo;already exists&rdquo;. Otherwise, create the account (with the initial balance of zero) and output &ldquo;ok&rdquo;.</p>

<p>For all commands other than create, if there is no account with the number specified as a parameter, the result will always be &ldquo;no such account&rdquo;. If the account exists (or both accounts do), the following rules apply</p>

<p>deposit: The result is always &ldquo;ok&rdquo; for existing accounts. Simply add the amount to the account balance.</p>

<p>withdraw: If the balance of the specified account is strictly lower than the requested amount, the result will be &ldquo;insufficient funds&rdquo;. Otherwise, subtract the amount and output &ldquo;ok&rdquo;.</p>

<p>transfer: First, if both account numbers are equal (including the bank code), the result should be &ldquo;same account&rdquo;. Similar to the previous case, if the balance of the source account is lower than the amount to be transferred, the result will be &ldquo;insufficient funds&rdquo;. Otherwise, transfer the money from the source account to the target one and output either &ldquo;ok&rdquo; if the transfer happens inside one bank or &ldquo;interbank&rdquo; if the money have to be transferred from one bank to another.</p>

<p>After each scenario, output the word &ldquo;end&rdquo; and one empty line. After the &ldquo;end&rdquo; of the last scenario, output one additional line containing the word &ldquo;goodbye&rdquo;.</p>