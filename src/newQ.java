class AddressList {
    public static int countAddressWithCity(Address[] addressList, String city) {
        if (addressList == null || city == null || addressList.length == 0) {
            return -1;
        }

        int count = 0;
        for (Address address : addressList) {
            if (address != null && city.equals(address.getCity())) {
                count++;
            }
        }
        return count;
    }

    public static int countAddressWithPin(Address[] addressList, String strP) {
        if (addressList == null || strP == null || addressList.length == 0) {
            return -1;
        }

        int count = 0;
        for (Address address : addressList) {
            if (address != null && address.getPin().startsWith(strP)) {
                count++;
            }
        }
        return count;
    }

    public static Address[] getAddressWithCity(Address[] addressList, String city) {
        if (addressList == null || city == null || addressList.length == 0) {
            return null;
        }

        int count = countAddressWithCity(addressList, city);
        if (count == 0) {
            return null;
        }

        Address[] result = new Address[count];
        int index = 0;
        for (Address address : addressList) {
            if (address != null && city.equals(address.getCity())) {
                result[index] = address;
                index++;
            }
        }
        return result;
    }

    public static Address[] getAddressWithPin(Address[] addressList, String strP) {
        if (addressList == null || strP == null || addressList.length == 0) {
            return null;
        }

        int count = countAddressWithPin(addressList, strP);
        if (count == 0) {
            return null;
        }

        Address[] result = new Address[count];
        int index = 0;
        for (Address address : addressList) {
            if (address != null && address.getPin().startsWith(strP)) {
                result[index] = address;
                index++;
            }
        }
        return result;
    }
}
