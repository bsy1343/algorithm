# [Platinum IV] Dança da Divisibilidade - 20279

[문제 링크](https://www.acmicpc.net/problem/20279)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

수학, 문자열, 분할 정복을 이용한 거듭제곱, KMP

### 문제 설명

<p>No pa&iacute;s da Nlog&ocirc;nia os habitantes realizam uma dan&ccedil;a especial para homenagear o deus da divisibilidade.A dan&ccedil;a &eacute; executada por N homens e N mulheres dispostos em dois c&iacute;rculos. Os homens ficam no c&iacute;rculo interno e as mulheres no c&iacute;rculo externo. Cada mulher inicia de frente para um homem.</p>

<p>A dan&ccedil;a &eacute; composta de K movimentos; homens e mulheres se alternam nos movimentos, come&ccedil;ando com os homens. No i-&eacute;simo movimento, as pessoas do c&iacute;rculo correspondente rotacionam P<sub>i</sub> passos em sentido hor&aacute;rio enquanto as pessoas do outro c&iacute;rculo permanecem paradas. Assim, cada pessoa troca de parceiro para um que est&aacute; a P<sub>i</sub> posi&ccedil;&otilde;es de dist&acirc;ncia. Um movimento &eacute; v&aacute;lido se os parceiros de cada pessoa s&atilde;o diferentes ao in&iacute;cio e ao fim do movimento e, al&eacute;m disso, nenhum par de pessoas est&aacute; frente a frente em dois instantes de tempo distintos.</p>

<p>Como forma de homenagem, as dan&ccedil;as sempre precisam terminar com casais cujas somas das idades tenham o mesmo resto quando dividido pelo n&uacute;mero sagrado M. Ou seja, se a soma das idades de um casal deixa um resto R quando divido por M, ent&atilde;o a soma das idades de todos os casais devem deixar o mesmo resto R ao fim da dan&ccedil;a.</p>

<p>Fornecidos N, M e K e as idades de todos os dan&ccedil;arinos, determine de quantas formas se pode realizar a dan&ccedil;a. Como a idade dos dan&ccedil;arinos &eacute; medida em segundos, os valores podem ser muito grandes.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m tr&ecirc;s inteiros N (3 &le; N &le; 10<sup>6</sup>), M (1 &le; M &le; 10<sup>9</sup>) e K (1 &le; K &le; 10<sup>9</sup>), correspondendo &agrave;&nbsp;quantidade de pessoas em um c&iacute;rculo, ao n&uacute;mero sagrado e &agrave; quantidade de movimentos da dan&ccedil;a, respectivamente.</p>

<p>A segunda linha da entrada cont&eacute;m N inteiros A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>) separados por um espa&ccedil;o em branco e representando a idade das mulheres.</p>

<p>A terceira linha da entrada cont&eacute;m N inteiros B<sub>i</sub> (1 &le; B<sub>i</sub> &le; 10<sup>9</sup>) separados por um espa&ccedil;o em branco e representando a idade dos homens.</p>

<p>Inicialmente o i-&eacute;simo homem est&aacute; alinhado com a i-&eacute;sima mulher, e o primeiro elemento de cada vetor &eacute; considerado &agrave; direita do respectivo &uacute;ltimo elemento.</p>

### 출력

<p>A sa&iacute;da consiste de um &uacute;nico inteiro representando o resto da divis&atilde;o do n&uacute;mero de dan&ccedil;as distintas por 10<sup>9</sup> + 7.</p>