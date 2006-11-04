package org.bouncycastle.jce.provider.test;

public class PEMData
{
    static String CERTIFICATE_1 = 
       "-----BEGIN X509 CERTIFICATE-----\r\n"
     + "MIIDXjCCAsegAwIBAgIBBzANBgkqhkiG9w0BAQQFADCBtzELMAkGA1UEBhMCQVUx\r\n"
     + "ETAPBgNVBAgTCFZpY3RvcmlhMRgwFgYDVQQHEw9Tb3V0aCBNZWxib3VybmUxGjAY\r\n"
     + "BgNVBAoTEUNvbm5lY3QgNCBQdHkgTHRkMR4wHAYDVQQLExVDZXJ0aWZpY2F0ZSBB\r\n"
     + "dXRob3JpdHkxFTATBgNVBAMTDENvbm5lY3QgNCBDQTEoMCYGCSqGSIb3DQEJARYZ\r\n"
     + "d2VibWFzdGVyQGNvbm5lY3Q0LmNvbS5hdTAeFw0wMDA2MDIwNzU2MjFaFw0wMTA2\r\n"
     + "MDIwNzU2MjFaMIG4MQswCQYDVQQGEwJBVTERMA8GA1UECBMIVmljdG9yaWExGDAW\r\n"
     + "BgNVBAcTD1NvdXRoIE1lbGJvdXJuZTEaMBgGA1UEChMRQ29ubmVjdCA0IFB0eSBM\r\n"
     + "dGQxFzAVBgNVBAsTDldlYnNlcnZlciBUZWFtMR0wGwYDVQQDExR3d3cyLmNvbm5l\r\n"
     + "Y3Q0LmNvbS5hdTEoMCYGCSqGSIb3DQEJARYZd2VibWFzdGVyQGNvbm5lY3Q0LmNv\r\n"
     + "bS5hdTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEArvDxclKAhyv7Q/Wmr2re\r\n"
     + "Gw4XL9Cnh9e+6VgWy2AWNy/MVeXdlxzd7QAuc1eOWQkGQEiLPy5XQtTY+sBUJ3AO\r\n"
     + "Rvd2fEVJIcjf29ey7bYua9J/vz5MG2KYo9/WCHIwqD9mmG9g0xLcfwq/s8ZJBswE\r\n"
     + "7sb85VU+h94PTvsWOsWuKaECAwEAAaN3MHUwJAYDVR0RBB0wG4EZd2VibWFzdGVy\r\n"
     + "QGNvbm5lY3Q0LmNvbS5hdTA6BglghkgBhvhCAQ0ELRYrbW9kX3NzbCBnZW5lcmF0\r\n"
     + "ZWQgY3VzdG9tIHNlcnZlciBjZXJ0aWZpY2F0ZTARBglghkgBhvhCAQEEBAMCBkAw\r\n"
     + "DQYJKoZIhvcNAQEEBQADgYEAotccfKpwSsIxM1Hae8DR7M/Rw8dg/RqOWx45HNVL\r\n"
     + "iBS4/3N/TO195yeQKbfmzbAA2jbPVvIvGgTxPgO1MP4ZgvgRhasaa0qCJCkWvpM4\r\n"
     + "yQf33vOiYQbpv4rTwzU8AmRlBG45WdjyNIigGV+oRc61aKCTnLq7zB8N3z1TF/bF\r\n"
     + "5/8=\r\n"
     + "-----END X509 CERTIFICATE-----\r\n";

    static String CERTIFICATE_2 = 
       "-----BEGIN CERTIFICATE-----\r\n"
     + "MIIDXjCCAsegAwIBAgIBBzANBgkqhkiG9w0BAQQFADCBtzELMAkGA1UEBhMCQVUx\r\n"
     + "ETAPBgNVBAgTCFZpY3RvcmlhMRgwFgYDVQQHEw9Tb3V0aCBNZWxib3VybmUxGjAY\r\n"
     + "BgNVBAoTEUNvbm5lY3QgNCBQdHkgTHRkMR4wHAYDVQQLExVDZXJ0aWZpY2F0ZSBB\r\n"
     + "dXRob3JpdHkxFTATBgNVBAMTDENvbm5lY3QgNCBDQTEoMCYGCSqGSIb3DQEJARYZ\r\n"
     + "d2VibWFzdGVyQGNvbm5lY3Q0LmNvbS5hdTAeFw0wMDA2MDIwNzU2MjFaFw0wMTA2\r\n"
     + "MDIwNzU2MjFaMIG4MQswCQYDVQQGEwJBVTERMA8GA1UECBMIVmljdG9yaWExGDAW\r\n"
     + "BgNVBAcTD1NvdXRoIE1lbGJvdXJuZTEaMBgGA1UEChMRQ29ubmVjdCA0IFB0eSBM\r\n"
     + "dGQxFzAVBgNVBAsTDldlYnNlcnZlciBUZWFtMR0wGwYDVQQDExR3d3cyLmNvbm5l\r\n"
     + "Y3Q0LmNvbS5hdTEoMCYGCSqGSIb3DQEJARYZd2VibWFzdGVyQGNvbm5lY3Q0LmNv\r\n"
     + "bS5hdTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEArvDxclKAhyv7Q/Wmr2re\r\n"
     + "Gw4XL9Cnh9e+6VgWy2AWNy/MVeXdlxzd7QAuc1eOWQkGQEiLPy5XQtTY+sBUJ3AO\r\n"
     + "Rvd2fEVJIcjf29ey7bYua9J/vz5MG2KYo9/WCHIwqD9mmG9g0xLcfwq/s8ZJBswE\r\n"
     + "7sb85VU+h94PTvsWOsWuKaECAwEAAaN3MHUwJAYDVR0RBB0wG4EZd2VibWFzdGVy\r\n"
     + "QGNvbm5lY3Q0LmNvbS5hdTA6BglghkgBhvhCAQ0ELRYrbW9kX3NzbCBnZW5lcmF0\r\n"
     + "ZWQgY3VzdG9tIHNlcnZlciBjZXJ0aWZpY2F0ZTARBglghkgBhvhCAQEEBAMCBkAw\r\n"
     + "DQYJKoZIhvcNAQEEBQADgYEAotccfKpwSsIxM1Hae8DR7M/Rw8dg/RqOWx45HNVL\r\n"
     + "iBS4/3N/TO195yeQKbfmzbAA2jbPVvIvGgTxPgO1MP4ZgvgRhasaa0qCJCkWvpM4\r\n"
     + "yQf33vOiYQbpv4rTwzU8AmRlBG45WdjyNIigGV+oRc61aKCTnLq7zB8N3z1TF/bF\r\n"
     + "5/8=\r\n"
     + "-----END CERTIFICATE-----\r\n";

    static String CRL_1 =
       "-----BEGIN X509 CRL-----\r\n"
     + "MIICjTCCAfowDQYJKoZIhvcNAQECBQAwXzELMAkGA1UEBhMCVVMxIDAeBgNVBAoT\r\n"
     + "F1JTQSBEYXRhIFNlY3VyaXR5LCBJbmMuMS4wLAYDVQQLEyVTZWN1cmUgU2VydmVy\r\n"
     + "IENlcnRpZmljYXRpb24gQXV0aG9yaXR5Fw05NTA1MDIwMjEyMjZaFw05NTA2MDEw\r\n"
     + "MDAxNDlaMIIBaDAWAgUCQQAABBcNOTUwMjAxMTcyNDI2WjAWAgUCQQAACRcNOTUw\r\n"
     + "MjEwMDIxNjM5WjAWAgUCQQAADxcNOTUwMjI0MDAxMjQ5WjAWAgUCQQAADBcNOTUw\r\n"
     + "MjI1MDA0NjQ0WjAWAgUCQQAAGxcNOTUwMzEzMTg0MDQ5WjAWAgUCQQAAFhcNOTUw\r\n"
     + "MzE1MTkxNjU0WjAWAgUCQQAAGhcNOTUwMzE1MTk0MDQxWjAWAgUCQQAAHxcNOTUw\r\n"
     + "MzI0MTk0NDMzWjAWAgUCcgAABRcNOTUwMzI5MjAwNzExWjAWAgUCcgAAERcNOTUw\r\n"
     + "MzMwMDIzNDI2WjAWAgUCQQAAIBcNOTUwNDA3MDExMzIxWjAWAgUCcgAAHhcNOTUw\r\n"
     + "NDA4MDAwMjU5WjAWAgUCcgAAQRcNOTUwNDI4MTcxNzI0WjAWAgUCcgAAOBcNOTUw\r\n"
     + "NDI4MTcyNzIxWjAWAgUCcgAATBcNOTUwNTAyMDIxMjI2WjANBgkqhkiG9w0BAQIF\r\n"
     + "AAN+AHqOEJXSDejYy0UwxxrH/9+N2z5xu/if0J6qQmK92W0hW158wpJg+ovV3+wQ\r\n"
     + "wvIEPRL2rocL0tKfAsVq1IawSJzSNgxG0lrcla3MrJBnZ4GaZDu4FutZh72MR3Gt\r\n"
     + "JaAL3iTJHJD55kK2D/VoyY1djlsPuNh6AEgdVwFAyp0v\r\n"
     + "-----END X509 CRL-----\r\n";

    static String CRL_2 =
       "-----BEGIN CRL-----\r\n"
     + "MIICjTCCAfowDQYJKoZIhvcNAQECBQAwXzELMAkGA1UEBhMCVVMxIDAeBgNVBAoT\r\n"
     + "F1JTQSBEYXRhIFNlY3VyaXR5LCBJbmMuMS4wLAYDVQQLEyVTZWN1cmUgU2VydmVy\r\n"
     + "IENlcnRpZmljYXRpb24gQXV0aG9yaXR5Fw05NTA1MDIwMjEyMjZaFw05NTA2MDEw\r\n"
     + "MDAxNDlaMIIBaDAWAgUCQQAABBcNOTUwMjAxMTcyNDI2WjAWAgUCQQAACRcNOTUw\r\n"
     + "MjEwMDIxNjM5WjAWAgUCQQAADxcNOTUwMjI0MDAxMjQ5WjAWAgUCQQAADBcNOTUw\r\n"
     + "MjI1MDA0NjQ0WjAWAgUCQQAAGxcNOTUwMzEzMTg0MDQ5WjAWAgUCQQAAFhcNOTUw\r\n"
     + "MzE1MTkxNjU0WjAWAgUCQQAAGhcNOTUwMzE1MTk0MDQxWjAWAgUCQQAAHxcNOTUw\r\n"
     + "MzI0MTk0NDMzWjAWAgUCcgAABRcNOTUwMzI5MjAwNzExWjAWAgUCcgAAERcNOTUw\r\n"
     + "MzMwMDIzNDI2WjAWAgUCQQAAIBcNOTUwNDA3MDExMzIxWjAWAgUCcgAAHhcNOTUw\r\n"
     + "NDA4MDAwMjU5WjAWAgUCcgAAQRcNOTUwNDI4MTcxNzI0WjAWAgUCcgAAOBcNOTUw\r\n"
     + "NDI4MTcyNzIxWjAWAgUCcgAATBcNOTUwNTAyMDIxMjI2WjANBgkqhkiG9w0BAQIF\r\n"
     + "AAN+AHqOEJXSDejYy0UwxxrH/9+N2z5xu/if0J6qQmK92W0hW158wpJg+ovV3+wQ\r\n"
     + "wvIEPRL2rocL0tKfAsVq1IawSJzSNgxG0lrcla3MrJBnZ4GaZDu4FutZh72MR3Gt\r\n"
     + "JaAL3iTJHJD55kK2D/VoyY1djlsPuNh6AEgdVwFAyp0v\r\n"
     + "-----END CRL-----\r\n";

    static String ATTRIBUTE_CERTIFICATE_1 =
       "-----BEGIN X509 ATTRIBUTE CERTIFICATE-----\r\n"
     + "MIIBuDCCASECAQEwZ6BlMGCkXjBcMQswCQYDVQQGEwJBVTEoMCYGA1UEChMfVGhl\r\n"
     + "IExlZ2lvbiBvZiB0aGUgQm91bmN5IENhc3RsZTEjMCEGA1UECxMaQm91bmN5IFBy\r\n"
     + "aW1hcnkgQ2VydGlmaWNhdGUCARSgYjBgpF4wXDELMAkGA1UEBhMCQVUxKDAmBgNV\r\n"
     + "BAoTH1RoZSBMZWdpb24gb2YgdGhlIEJvdW5jeSBDYXN0bGUxIzAhBgNVBAsTGkJv\r\n"
     + "dW5jeSBQcmltYXJ5IENlcnRpZmljYXRlMA0GCSqGSIb3DQEBBQUAAgEBMCIYDzIw\r\n"
     + "MDUwNjEwMDI0MTMzWhgPMjAwNTA2MTAwMjQzMTNaMBkwFwYDVRhIMRAwDoEMREFV\r\n"
     + "MTIzNDU2Nzg5MA0GCSqGSIb3DQEBBQUAA4GBALAYXT9zdxSR5zdPLAon1xIPehgI\r\n"
     + "NZhjM7w0uu3OdzSV5sC31X1Kx9vi5RIWiM9VimRTwbQIod9POttD5QMXCwQb/fm7\r\n"
     + "eiJqL2YBIXOeClB19VrQe8xQtMFbyuFpDiM7QdvIam9ShZZMEMGjv9QHI64M4b0G\r\n"
     + "odUBlSsJwPPQjZSU\r\n"
     + "-----END X509 ATTRIBUTE CERTIFICATE-----\r\n";

    static String ATTRIBUTE_CERTIFICATE_2 =
       "-----BEGIN ATTRIBUTE CERTIFICATE-----\r\n"
     + "MIIBuDCCASECAQEwZ6BlMGCkXjBcMQswCQYDVQQGEwJBVTEoMCYGA1UEChMfVGhl\r\n"
     + "IExlZ2lvbiBvZiB0aGUgQm91bmN5IENhc3RsZTEjMCEGA1UECxMaQm91bmN5IFBy\r\n"
     + "aW1hcnkgQ2VydGlmaWNhdGUCARSgYjBgpF4wXDELMAkGA1UEBhMCQVUxKDAmBgNV\r\n"
     + "BAoTH1RoZSBMZWdpb24gb2YgdGhlIEJvdW5jeSBDYXN0bGUxIzAhBgNVBAsTGkJv\r\n"
     + "dW5jeSBQcmltYXJ5IENlcnRpZmljYXRlMA0GCSqGSIb3DQEBBQUAAgEBMCIYDzIw\r\n"
     + "MDUwNjEwMDI0MTMzWhgPMjAwNTA2MTAwMjQzMTNaMBkwFwYDVRhIMRAwDoEMREFV\r\n"
     + "MTIzNDU2Nzg5MA0GCSqGSIb3DQEBBQUAA4GBALAYXT9zdxSR5zdPLAon1xIPehgI\r\n"
     + "NZhjM7w0uu3OdzSV5sC31X1Kx9vi5RIWiM9VimRTwbQIod9POttD5QMXCwQb/fm7\r\n"
     + "eiJqL2YBIXOeClB19VrQe8xQtMFbyuFpDiM7QdvIam9ShZZMEMGjv9QHI64M4b0G\r\n"
     + "odUBlSsJwPPQjZSU\r\n"
     + "-----END ATTRIBUTE CERTIFICATE-----\r\n";
}
